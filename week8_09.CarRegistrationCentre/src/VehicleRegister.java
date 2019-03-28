/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
/**
 *
 * @author Tiago Romero
 */
import java.util.*;
public class VehicleRegister {
private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate,String>();
public boolean add(RegistrationPlate plate, String owner){
for (RegistrationPlate key : owners.keySet() ) {
    if (key.equals(plate)){
    return false;}}
    owners.put(plate, owner);
    return true;   
}
public String get(RegistrationPlate plate){
for ( RegistrationPlate key : owners.keySet() ) {
    if (key.equals(plate)){
        return owners.get(key);}
    }return null;
}
public boolean delete(RegistrationPlate plate){
    for (RegistrationPlate key : owners.keySet() ) {
    if (key.equals(plate)){
        owners.remove(key);
        return true;}
    }   
return false;
   }
public void printRegistrationPlates(){
    for (RegistrationPlate key : owners.keySet() ) {
        String plate = key.toString();
        System.out.println(plate);
    }
}
public void printOwners(){
ArrayList<String> printedOwners = new ArrayList<String>();
   for (RegistrationPlate key : owners.keySet() ) {
        if (!printedOwners.contains(owners.get(key))){
            System.out.println(owners.get(key));
        printedOwners.add(owners.get(key));
        }
        
   }
}    
}

