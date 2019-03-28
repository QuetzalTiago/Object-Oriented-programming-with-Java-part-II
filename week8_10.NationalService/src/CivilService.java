/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Romero
 */
public class CivilService implements NationalService {
    public CivilService(){
    }
    private int daysLeft=362;   
   
    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
     if(daysLeft>=1){
         daysLeft--;
     }
     
    }
    
}
