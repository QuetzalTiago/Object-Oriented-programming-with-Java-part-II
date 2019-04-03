package wormgame.gui;

import wormgame.game.WormGame;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel implements Updatable {

    private WormGame wormGame;
    private int pieceLength;

    public DrawingBoard(WormGame wg, int pieceLength){
        this.wormGame=wg;
        this.pieceLength=pieceLength;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for (int i = 0;i<wormGame.getWorm().getPieces().size();i++) {
            g.fill3DRect(wormGame.getWorm().getPieces().get(i).getX()*pieceLength, wormGame.getWorm().getPieces().get(i).getY()*pieceLength, pieceLength, pieceLength, true);
        }
        g.setColor(Color.RED);
        g.fillOval(wormGame.getApple().getX()*pieceLength,wormGame.getApple().getY()*pieceLength,pieceLength,pieceLength);
    }

    @Override
    public void update() {
        this.repaint();
    }
}
