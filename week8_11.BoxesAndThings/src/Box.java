
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Romero
 */
import java.util.*;
public class Box implements ToBeStored{
private double maxWeight;
private double totalWeight;
private ArrayList<ToBeStored> things = new ArrayList<ToBeStored>();
public Box(double maxWeight){
    this.maxWeight=maxWeight;
} 

public double weight() {
    double weightSum=0;
    for (ToBeStored thing:things){       
        weightSum+=thing.weight();}    
    return weightSum;
    }

public void add(ToBeStored item){
    totalWeight+=item.weight();
    if (totalWeight<=maxWeight){
        things.add(item);
    }else{totalWeight-=item.weight();     }  
}
public String toString(){
    double totalWeight = 0;
    for (ToBeStored thing:things){       
        totalWeight+=thing.weight();
    }
    return "Box: "+things.size()+" things,"+" total weight "+totalWeight+" kg";
}

    
}
