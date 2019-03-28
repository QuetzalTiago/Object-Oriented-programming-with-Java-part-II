
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Romero
 */
public class PromissoryNote {
    private HashMap<String, Double> promissoryNote = new HashMap<String, Double>(); 
public PromissoryNote(){
    
}
public void setLoan(String toWhom, double value){
    promissoryNote.put(toWhom, value);
}
public double howMuchIsTheDebt(String whose){
    if(promissoryNote.containsKey(whose)){
            return promissoryNote.get(whose);}
return 0;
}



}
