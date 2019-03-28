import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private int number;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300,150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        final JTextField output = new JTextField("0");
        output.setEnabled(false);
        final JTextField input = new JTextField();

        JPanel buttons = new JPanel();

        container.setLayout(new GridLayout(3,1));
        container.add(output);
        container.add(input);

        final JButton plus = new JButton("+");
        final JButton minus = new JButton("-");
        final JButton z = new JButton("Z");

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isNumeric(input.getText())) {
                    int pastNumber = number;
                    number = Integer.parseInt(input.getText()) + pastNumber;
                    input.setText("");
                    output.setText(String.valueOf(number));
                    if (number == 0) {
                        z.setEnabled(false);
                    } else {
                        z.setEnabled(true);
                    }
                } else {
                    input.setText("");
                }
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (isNumeric(input.getText())) {
                    int pastNumber = number;
                    number=pastNumber-Integer.parseInt(input.getText());
                    input.setText("");
                    output.setText(String.valueOf(number));
                    if (number==0){
                        z.setEnabled(false);
                    }else{
                        z.setEnabled(true);
                    }
                }else{
                input.setText("");
                }
            }
        });
        z.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                number=0;
                output.setText("0");
                input.setText("");
                if (number==0){
                    z.setEnabled(false);
                }else{
                    z.setEnabled(true);
                }
            }
        });

        if (number==0){
            z.setEnabled(false);
        }else{
            z.setEnabled(true);
        }
        buttons.add(plus);
        buttons.add(minus);
        buttons.add(z);
        buttons.setLayout(new GridLayout(1,3));

        container.add(buttons);
    }
        public boolean isNumeric(String strNum) {
            try {
                Double.parseDouble(strNum);
                return true;
            } catch(Exception e){
                return false;
            }
        }

    public JFrame getFrame() {
        return frame;
    }
}
