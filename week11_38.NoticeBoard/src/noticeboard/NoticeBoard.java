package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400,300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);


    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);

        JTextField textAreaUp = new JTextField();
        JLabel textAreaDown = new JLabel("I was copied here from JTextArea.");
        JButton copyButton = new JButton("Copy!");

        ActionEventListener copier = new ActionEventListener(textAreaUp,textAreaDown);
        copyButton.addActionListener(copier);

        container.add(textAreaUp);
        container.add(copyButton);
        container.add(textAreaDown);



    }
}
