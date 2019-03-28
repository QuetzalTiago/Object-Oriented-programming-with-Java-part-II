package movingfigure;

import java.awt.*;
import java.util.ArrayList;

public class CompoundFigure extends Figure {

    private ArrayList<Figure> figures = new ArrayList<Figure>();

    public CompoundFigure(int x, int y) {
        super(x, y);
    }
    public CompoundFigure() {

    }

    @Override
    public void draw(Graphics graphics) {
        for (int i = 0; i < figures.size(); i++){
            figures.get(i).draw(graphics);
        }

    }

    public void add(Figure f){
        figures.add(f);
    }

    public void move(int dx, int dy){
        for (int i = 0; i < figures.size(); i++){
            figures.get(i).move(dx,dy);
        }
    }


}
