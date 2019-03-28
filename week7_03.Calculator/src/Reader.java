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
public class Reader {
private Scanner sc = new Scanner(System.in);    

public String readString(){
String a = sc.nextLine();
return a;
}
public int readInteger(){
int number = Integer.parseInt( sc.nextLine() );
return number;    
}
    
}
