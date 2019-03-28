package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private Figure figure;

    public UserInterface(Figure figure){
        this.figure=figure;
    }

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {

        DrawingBoard drawingBoard = new DrawingBoard(figure);
        container.add(drawingBoard);

        frame.addKeyListener(new KeyboardListener(drawingBoard,figure));


    }

    private void addListeners() {
    }

    public JFrame getFrame() {
        return frame;
    }
}
