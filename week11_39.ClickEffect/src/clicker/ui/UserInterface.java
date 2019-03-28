package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(350, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        PersonalCalculator calc = new PersonalCalculator();

        JLabel text = new JLabel(String.valueOf(calc.giveValue()));
        JTextField textField = new JTextField(String.valueOf(text));
        JButton clickButton = new JButton("Click!");

        ClickListener clicker = new ClickListener(calc,text);
        clickButton.addActionListener(clicker);

        container.add(text);
        container.add(clickButton);

        JLabel infoTime = new JLabel("Time: "+0);
        JLabel infoCps = new JLabel("CPS: ");
        JButton reset = new JButton("Reset");
        ResetListener resetListener = new ResetListener(calc,text);
        reset.addActionListener(resetListener);

        container.add(reset);











    }

    public JFrame getFrame() {
        return frame;
    }
}
