package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);

        Worm worm = new Worm(width/2,height/2,Direction.DOWN);
        this.worm=worm;
        newApple();


    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }

        worm.move();
        if (worm.runsInto(apple)){
            worm.grow();
            newApple();
        }
        if (worm.runsIntoItself()) {
            continues=false;
        }
        for (int i = 0;i<worm.getPieces().size();i++) {  //if worm touches border, quit
            if (worm.getPieces().get(i).getX()<0){
                continues=false;
            }
            if (worm.getPieces().get(i).getY()<0){
                continues=false;
            }
            if (worm.getPieces().get(i).getX()>=width){
                continues=false;
            }
            if (worm.getPieces().get(i).getY()>=height){
                continues=false;
            }
        }
        updatable.update();
        setDelay(1000 / worm.getLength());

    }

    public Worm getWorm(){
        return worm;
    }

    public void setWorm(Worm worm){
        this.worm=worm;
    }

    public Apple getApple(){
        return apple;
    }

    public void setApple(Apple apple){
        this.apple=apple;
    }

    public void newApple(){
        Random r = new Random();
        Apple apple = new Apple(r.nextInt(width),r.nextInt(height));
        if(!(apple.getX()==width/2&&apple.getY()==height/2)){// apple is not in the center
            this.apple=apple;
        }else{//Apple IS in the center
            apple = new Apple(r.nextInt(width),r.nextInt(height));// new apple, chances of being on the center again very low
            this.apple=apple;
        }
    }




}
