package movingfigure;

import java.awt.*;

public class Box extends Figure {

    private int widht;
    private int height;

    public Box(int x, int y, int width, int height) {

        super(x, y);
        this.widht=width;
        this.height=height;

    }

    @Override
    public void draw(Graphics graphics){
        graphics.fillRect(super.getX(),super.getY(),widht,height);
    }
}
