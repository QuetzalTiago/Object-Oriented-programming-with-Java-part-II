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
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand = new ArrayList<Card>();
    public void add(Card card){
        hand.add(card);
    } 
    public void print(){
        for(int i = 0; i<hand.size();i++){
            System.out.println(hand.get(i));
        }
    }
    public void sort(){
        Collections.sort(hand);
    }
    public int getValue(){
        int value = 0;
        for (int i = 0; i<hand.size();i++){           
            value +=hand.get(i).getValue();}
        return value;
    }

    @Override
    public int compareTo(Hand hand) {
        if (this.getValue()==hand.getValue()){
            return 0;
        }
        else if (this.getValue() > hand.getValue()){
            return 1;
        }else{
            return -1;
        }
    }
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue c = new SortAgainstSuitAndValue();
        Collections.sort(hand, c);
        for(int i = 0; i<hand.size();i++){
            System.out.println(hand.get(i));}
    }
    
}
