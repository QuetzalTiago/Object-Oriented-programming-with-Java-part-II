/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Romero
 */
public class Change {
private char fromCharacter;
private char toCharacter;

public Change(char fromCharacter, char toCharacter){
this.fromCharacter=fromCharacter;
this.toCharacter=toCharacter;
}
public String change(String characterString){
    for(int n = 0; n < characterString.length();n++){
       char c = characterString.charAt(n);
       if (c==fromCharacter ){
       String newWord = characterString.replace(c, toCharacter);      
       return newWord;
       }       
    }return "Letter not found";
}
}

