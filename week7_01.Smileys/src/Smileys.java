
import java.util.*;
public class Smileys {
 
    public static void main(String[] args) {
        // Test your method at least with the following
         //printWithSmileys("Matti");
       //printWithSmileys("Beerbottle");
         //printWithSmileys("Interface");
         String word = "carrot";
  Change change1 = new Change('a', 'b');
  word = change1.change(word);

  System.out.println(word);

  Change Change2 = new Change('r', 'x');
  word = Change2.change(word);

  System.out.println(word);
    }
    private static void printWithSmileys(String characterString){
        String middleString = createMiddleString(characterString);
        int amount = middleString.length()/2 + 2;
        printSmileys(amount);
        System.out.println("");
        System.out.println(":)"+ middleString + ":)");
        printSmileys(amount);
        
    }
    private static void printSmileys (int number){
        for (int i = 0; i <number; i++){
            System.out.print(":)");
        }
    }
    private static String createMiddleString (String characterString){
        String mid = " "+ characterString +" ";
            if (characterString.length() % 2 == 1){
               return mid + " ";}
            return mid;
            
       
    }
}

        
    
    
 
        
    
    


