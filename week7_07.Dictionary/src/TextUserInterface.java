
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
public class TextUserInterface {
    private Scanner reader=new Scanner(System.in);
    private Dictionary dictionary = new Dictionary();
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader=reader;
        this.dictionary=dictionary;
    }
    public void start(){
        System.out.println("Statement:\n"
                + "add - adds a word pair to the dictionary\n"
                + "translate - asks a word and prints its translation\n"
                + "quit - quit the text user interface");
        while(true){
            System.out.println("Statement: ");
            String statement = reader.nextLine();
            if (statement.equals("quit")){
                System.out.println("Cheers!");
                break;
            }
            else if (statement.equals("add")){
                add();
            }
            else if (statement.equals("translate")){
                translate();
            }else{
            System.out.println("Unknown statement");}
                       
        }
    }

    private void add() {
        System.out.println("In english");
        String word = reader.nextLine();
        System.out.println("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(word, translation);
        System.out.println("");
    }
    public void translate(){
        System.out.println("Give a word: ");
        String word = reader.nextLine();
        String translation = dictionary.translate(word);
        System.out.println(translation);
    }
}
