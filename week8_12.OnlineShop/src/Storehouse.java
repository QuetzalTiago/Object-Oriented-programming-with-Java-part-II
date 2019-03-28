
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
import java.util.*;
public class Storehouse {
    private Map<String, Integer> productPrices = new HashMap<String, Integer>();
    private Map<String, Integer> productStock = new HashMap<String, Integer>();    
public void addProduct(String product, int price, int stock){
    productPrices.put(product, price);
    productStock.put(product, stock);
}
public int price(String product){
    if (productPrices.containsKey(product)){
        return productPrices.get(product);}
return -99;    
}
public int stock(String product){
    if (productStock.containsKey(product)){
    return productStock.get(product);}
    return 0;
}
public boolean take(String product){
    if (productStock.containsKey(product)){
        int i = productStock.get(product);
        if(i>0){
        i--;
        productStock.replace(product, i);
        return true;}
    }return false;   
}
public Set<String> products(){
    return productPrices.keySet();
}

}



