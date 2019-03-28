
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
public class Flight {
    private HashMap<Airplane, String> flights = new HashMap<Airplane, String>();
    private Airplane airplane;
    private String departure;
    private String destination;
    public Flight (Airplane plane, String departure, String destination){
        this.airplane=plane;
        this.departure=departure;
        this.destination=destination;
        
    }
    public String toString(){
        return airplane + " (" + departure + "-" + destination+")";
    }
}

