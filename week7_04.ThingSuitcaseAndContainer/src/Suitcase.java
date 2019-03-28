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
public class Suitcase {
private int weightLimit;    
private ArrayList<Thing> things = new ArrayList<Thing>();
private int totalWeight = 0;
public Suitcase(int weightLimit){
this.weightLimit=weightLimit;    
}
public void addThing(Thing thing){
totalWeight+=thing.getWeight();
if (totalWeight<=weightLimit){
    things.add(thing);
}else{
    totalWeight-=thing.getWeight();
    things.remove(thing);
}
}
public String toString(){
    int amountOfThings=things.size();
    if (amountOfThings==0){
        return "empty "+"("+totalWeight+"kg)";
    }
    if (amountOfThings==1){
        return amountOfThings+" thing"+"("+totalWeight+"kg)";
    }
    if (amountOfThings>=2){
        return amountOfThings+" things"+"("+totalWeight+"kg)";
    }
    return "";
}
public void printThings(){
    for(int i =0;i<things.size();i++){
        System.out.println(things.get(i));
    }
}
public int totalWeight(){
    return totalWeight;
}
public Thing heaviestThing(){
    Thing heaviest = new Thing ("",0);
    if (things.size()>=1){
    for(int i =0;i<things.size();i++){
        if (things.get(i).getWeight()>heaviest.getWeight()){
            heaviest=things.get(i);
        }  
    }
    return heaviest;}
    return null;     
    }
public int getWeight(){
    return totalWeight;
}
public ArrayList returnThings(){
    return things;        
}
}
