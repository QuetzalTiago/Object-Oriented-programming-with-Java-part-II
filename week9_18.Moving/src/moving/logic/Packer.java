package moving.logic;
import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;
    public Packer (int boxesVolume){
        this.boxesVolume=boxesVolume;
    }
    public List<Box> packThings(List<Thing> things){
        int minus = things.size()/2;
        int size = things.size()-minus;
        int counter = 0;
        int boxesIndex = 0;
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(new Box(boxesVolume));
        for (int i = counter; i<size;i++){
            boxes.get(boxesIndex).addThing(things.get(i));
            counter++;
            }
        boxes.add(new Box(boxesVolume));
        boxesIndex++;
        for (int i = counter; i<things.size();i++){
            boxes.get(boxesIndex).addThing(things.get(i));
            counter++;
        }
        return boxes;
    }
}
