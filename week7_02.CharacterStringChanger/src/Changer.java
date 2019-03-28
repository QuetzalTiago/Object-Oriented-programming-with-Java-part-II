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
public class Changer {
public Changer(){    
}
ArrayList<Change> changes = new ArrayList<Change>();
public void addChange(Change change){
    changes.add(change);
}    
public String change(String characterString){
String word = characterString;
for (Change Change : changes) {
        word = Change.change(word);
}
return word;    
}
}
