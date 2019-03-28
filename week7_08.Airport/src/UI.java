/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Tiago Romero
 */
public class UI {
    private Scanner reader =new Scanner(System.in);
    private ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    public UI(Scanner reader){
        this.reader=reader;
    }    
    public void start(){
        System.out.println("Airport panel\n" +"--------------------");
        System.out.println(operations());
        first: while(true){
        String operation = reader.nextLine();
        if (operation.equals("1")){
                addPlane();
                System.out.println(operations());
        }//Agrega un airplane (se repite dos veces operations() por alguna razon)
        else if (operation.equals("2")){
                addFlight();//Agrega un flight
                System.out.println(operations());
        }
        else if (operation.equals("x")){//Abre siguiente menu
            System.out.println(""
                    + "Flight service\n" +"------------");
            while(true){
            flightServiceOperations();
            String flightServiceOperation = reader.nextLine();
            if (flightServiceOperation.equals("1")){
                for (int b = 0;b<airplanes.size();b++){
                System.out.println(airplanes.get(b));}               
            }
            else if (flightServiceOperation.equals("2")){
                for (int b = 0;b<flights.size();b++){
                System.out.println(flights.get(b));}
            }
            else if (flightServiceOperation.equals("3")){    
                System.out.println("Give plane ID: ");
                String PlaneId = reader.nextLine();
                for(int i = 0;i<airplanes.size();i++){
                   if(airplanes.get(i).getPlaneID().equals(PlaneId)){
                       System.out.println(airplanes.get(i));
                    }
                }
            }
            else if (flightServiceOperation.equals("x")){      
                break first;             
            }
            }
            
        }
    }
    
}
    public String operations(){
        return
               "Choose operation:\n" +
               "[1] Add airplane\n" +
               "[2] Add flight\n" +
               "[x] Exit";
    }
    public void flightServiceOperations(){
        System.out.println(
               "Choose operation:\n" +
               "[1] Print planes\n" +
               "[2] Print flights\n" +
               "[3] Print plane info\n" +
               "[x] Quit");
    }
    public void addPlane(){
        System.out.println("Give plane ID: ");
               String newId = reader.nextLine();
               System.out.println("Give plane capacity: ");
               int newCapacity = reader.nextInt();
               Airplane newAirplane = new Airplane(newCapacity,newId);
               airplanes.add(newAirplane);
               //System.out.println("plain added");
    }
    public void addFlight(){
        System.out.println("Give plane ID: ");
                String PlaneId = reader.nextLine();
                for(int i = 0;i<airplanes.size();i++){
                   if(airplanes.get(i).getPlaneID().equals(PlaneId)){
                        System.out.println("Give departure airport code: ");
                            String depature = reader.nextLine();
                        System.out.println("Give destination airport code: ");
                            String destination = reader.nextLine();   
                        Flight newFlight = new Flight(airplanes.get(i),depature,destination);
                        flights.add(newFlight);
                            //System.out.println("flight added");  
                   }//else{System.out.println("Plain ID not found");
                //}
            }
    }
    
}
