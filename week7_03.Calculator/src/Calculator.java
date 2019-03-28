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
public class Calculator {
private Reader sc = new Reader();
private int calculations;
    public void start(){
        while (true) {
            System.out.print("command: ");
            String command = sc.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                calculations++;
            } else if (command.equals("difference")) {
                difference();
                calculations++;
            } else if (command.equals("product")) {
                product();
                calculations++;
            }
        }

        statistics();
    }
    private void sum(){
        System.out.println("value 1: ");
        int a = sc.readInteger();
        System.out.println("value 2: ");
        int b = sc.readInteger();
        int sum = a + b;
        System.out.println("sum of the values = "+sum);    
    }
    private void difference(){
        System.out.println("value 1: ");
        int a = sc.readInteger();
        System.out.println("value 2: ");
        int b = sc.readInteger();
        int difference = a - b;
        System.out.println("difference of the values = "+difference);
    }
    private void product(){
        System.out.println("value 1: ");
        int a = sc.readInteger();
        System.out.println("value 2: ");
        int b = sc.readInteger();
        int product = a * b;
        System.out.println("product of the values = "+product);
        
        
    }
    private void statistics(){
        System.out.println("calculations done "+calculations);
        
    }
}
