import java.lang.reflect.Array;
import java.util.*;

public class Jumper implements Comparable<Jumper> {
    private String name;
    private int jumpLenght;
    private ArrayList <Integer> jumps = new ArrayList<Integer>();
    private int totalPoints;
    private ArrayList<Jumper> list = new ArrayList<Jumper>();
public Jumper(String name){
this.name=name;
}
public int jump(){
    Random rand = new Random();
    //((max - min) + 1) + min
    int distance = rand.nextInt((120-60)+1)+60;
    jumpLenght=distance;
    jumps.add(distance);
    return distance;
}
public ArrayList<Integer> points(){
    ArrayList <Integer> points = new ArrayList<Integer>();
    Random rand = new Random();
    for(int i=0;i<5;i++){
        //((max - min) + 1) + min
        int point = rand.nextInt((20-10)+1)+10;
        points.add(point);
    }
    addUpPoints(points);
    return points;
}
public String getName(){
    return name;
}
public int getPoints(){
    return totalPoints;
}
public String toString(){
    return name+" ("+totalPoints+" points)";
}
public void addUpPoints(ArrayList<Integer> array){
    Collections.sort(array);
    for(int i=1;i<4;i++){
        totalPoints+=array.get(i);
    }
    totalPoints+=jumpLenght;

}
public ArrayList <Integer> getJumps(){
    return this.jumps;
}

    @Override
    public int compareTo(Jumper jumper) {
        if (jumper.getPoints()==this.getPoints()){
            return 0;
        }
        if (jumper.getPoints()>this.getPoints()){
            return 1;
        }else{
            return -1;

        }
    }
    public ArrayList<Jumper> sortArrayList(ArrayList<Jumper> list){
    Collections.reverse(list);
    return list;
    }

}


