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
public class ShoppingBasket {
    private Map<String, Purchase> list = new HashMap<String, Purchase>();
    public ShoppingBasket(){       
    }
    
    public void add(String product, int price){
        if (list.containsKey(product)){
            list.get(product).increaseAmount();
        }else{
        Purchase newPurchase = new Purchase(product, 1, price);
        list.put(product,newPurchase);}
    }
    
    public int price(){
        int value = 0;
        for (String entry:list.keySet()){
            value+=list.get(entry).price();
        }
        return value;
    }
    
    public void print(){
        for (Map.Entry<String, Purchase> entry:list.entrySet()){
            System.out.println(entry.getValue());
        }
    }
    
    
    
}
