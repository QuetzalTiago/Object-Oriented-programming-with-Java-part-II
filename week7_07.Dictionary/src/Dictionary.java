
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Romero
 */
public class Dictionary {
    private HashMap<String, String> dictionary = new HashMap<String, String>(); 
public String translate(String word){
    return dictionary.get(word);
}
public void add(String word, String translation){
    dictionary.put(word, translation);
}
public int amountOfWords(){
    return dictionary.size();
}
public ArrayList<String> translationList(){
ArrayList<String> keyList = new ArrayList<String>();
    for ( String key : dictionary.keySet() ) {
        keyList.add(key+" = "+dictionary.get(key));
    }
        return keyList;
}
}
