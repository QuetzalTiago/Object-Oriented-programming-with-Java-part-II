package moving.domain;
import java.util.*;
public class Box implements Thing{
    private int capacity;
    private ArrayList<Thing> list = new ArrayList<Thing>();
    public Box(int maximumCapacity){
        this.capacity=maximumCapacity;
    }
    public boolean addThing(Thing thing){
        if ((thing.getVolume()+this.getVolume())<=capacity){
            list.add(thing);
            return true; }
        return false;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (int i = 0; i<list.size();i++){
            volume+=list.get(i).getVolume();
        }
        return volume;
    }

    public int getCapacity() {
        return capacity;
    }
}
