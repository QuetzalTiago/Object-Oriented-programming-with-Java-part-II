/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Romero
 */
public class MilitaryService implements NationalService{
    private int daysLeft; 
    public MilitaryService(int days){
    this.daysLeft=days;
    }  
   
    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
     if(daysLeft>=1){
         daysLeft--;
     }
     
    }
    
}
