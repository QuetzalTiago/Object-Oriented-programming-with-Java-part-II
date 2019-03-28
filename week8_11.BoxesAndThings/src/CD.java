/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Romero
 */
public class CD implements ToBeStored{
    private String author;
    private String name;
    private int year;
    private double weight = 0.1;
    public CD (String author, String name, int year){
        this.author=author;
        this.name=name;
        this.year=year;
    }

    public String toString() {
        return author+": "+name+ " ("+year+")";
    }
    public double weight() {
    return weight;
    }
    
}
