package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");// Nuevo frame, string de titulo
        frame.setPreferredSize(new Dimension(200,300));// Darle la resolucion
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// exit feature
        createComponents(frame.getContentPane());//crear componentes
        frame.pack();// ????
        frame.setVisible(true);//hacer visible
    }

    private void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);//layout de los botones (orden)
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(yes);
        buttonGroup.add(no);

        container.add(yes);
        container.add(no);

        container.add(new JLabel("Why?"));
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(noReason);
        buttonGroup1.add(fun);

        container.add(noReason);
        container.add(fun);

        JButton done = new JButton("Done!");
        container.add(done);



    }


    public JFrame getFrame() {
        return frame;
    }
}
