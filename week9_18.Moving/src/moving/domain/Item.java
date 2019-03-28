package moving.domain;

public class Item implements Thing, Comparable<Item>{
    private String name;
    private int volume;
    public Item (String name, int volume){
        this.name=name;
        this.volume=volume;
    }
    public String getName(){
     return name;
    }
    public String toString(){
        return name+" ("+volume+" dm^3)";
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int compareTo(Item comparable) {
        if (this.getVolume()>comparable.getVolume()){
            return 1;
        }
        else if (this.getVolume()<comparable.getVolume()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
