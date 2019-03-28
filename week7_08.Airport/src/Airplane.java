/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Romero
 */
public class Airplane {
    private int capacity;
    private String planeId;
    public Airplane(int amount, String planeId){
        this.capacity=amount;
        this.planeId=planeId;
    }
    public String getPlaneID(){
        return planeId;}
    public int getPlaneCapacity(){
        return capacity;
    }
    public String toString(){
        return planeId +" "+"("+capacity+" ppl"+")";
    }
    
}


