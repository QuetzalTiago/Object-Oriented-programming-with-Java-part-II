package movable;

import java.util.ArrayList;

public class Group implements Movable {
    private ArrayList<Movable> group = new ArrayList<Movable>();

    @Override
    public void move(int dx, int dy) {
        for (int i = 0; i < group.size(); i++) {
            group.get(i).move(dx, dy);
        }
    }

    public void addToGroup(Movable movable){
        group.add(movable);
    }

    public String toString() {
            String position = "";
            for (int i = 0; i < group.size(); i++) {
                position +=group.get(i).toString()+"\n  ";
            }
            return position;
        }

}
