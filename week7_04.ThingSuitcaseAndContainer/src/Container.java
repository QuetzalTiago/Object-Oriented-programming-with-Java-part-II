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
public class Container {
private int maxWeightLimit;
private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
private int totalWeight = 0;
public Container(int maxWeightLimit){
    this.maxWeightLimit=maxWeightLimit;
}
public void addSuitcase(Suitcase suitcase){
totalWeight+=suitcase.getWeight();
if (totalWeight<=maxWeightLimit){
    suitcases.add(suitcase);
}else{
    totalWeight-=suitcase.getWeight();
    suitcases.remove(suitcase);
}
}
public String toString(){
    int amountOfSuitcases=suitcases.size();
    if (amountOfSuitcases==0){
        return "empty "+"("+totalWeight+"kg)";
    }
    if (amountOfSuitcases==1){
        return amountOfSuitcases+" suitcase "+"("+totalWeight+"kg)";
    }
    if (amountOfSuitcases>=2){
        return amountOfSuitcases+" suitcases "+"("+totalWeight+"kg)";
    }
    return "";
}
public void printThings(){
    for(int i=0;i<suitcases.size();i++){
        ArrayList<Thing> things = suitcases.get(i).returnThings();
        for(int b =0;b<things.size();b++){
            System.out.println(things.get(b));
        }
        
        
            }
        
    
}

}
