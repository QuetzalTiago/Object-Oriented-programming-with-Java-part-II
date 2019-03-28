import java.util.*;
public class UI {
    private Scanner reader = new Scanner(System.in);
    private Reader scanner = new Reader(reader);
    private Jumper jumper;
    private ArrayList<Jumper> list = new ArrayList<Jumper>();
    public UI(Scanner reader) {
        this.reader = reader;

    }

    public void start() {
        System.out.print("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String input = scanner.read();
            if (input.equals("")) {
                tournament();
                results();
                break;
            } else {
                Jumper newJumper = new Jumper(input);
                list.add(newJumper);
            }
        }

    }

    public void tournament() {
        System.out.println("");
        System.out.println("The tournament begins!\n");
        int round = 1;
        label2:
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = scanner.read();
            if (input.equals("jump")) {
                System.out.println("Round " + round + "\n");
                System.out.println("Jumping order: ");
                Collections.sort(list);
                Collections.reverse(list);
                int jumpingOrder = 1;
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("  " + jumpingOrder + ". " + list.get(i));
                    jumpingOrder++;
                }
                System.out.println("");
                System.out.println("Results of round " + round);
                ;
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("  "+list.get(i).getName());
                    System.out.println("    "+"length: " + list.get(i).jump());
                    System.out.println("    "+"judge votes:" + list.get(i).points());
                }
                round++;
                System.out.println("");
            } else {
                break;
            }
        }
    }

    public void results() {
        System.out.println("");
        System.out.println("Thanks!\n");
        System.out.println("Tournament results: ");
        Collections.sort(list);
        System.out.println("Position    Name");
        int place = 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(place + "           " + list.get(i));
            System.out.println("            jump lengths: "+printJumps(list.get(i)));
            place++;
        }
    }

    public String printJumps(Jumper jumper) {
        String jumps = "";
        for (int i = 0; i < jumper.getJumps().size(); i++) {
            if (i<jumper.getJumps().size()-1){
                jumps+=jumper.getJumps().get(i)+" m, ";
            }else{
            jumps+=jumper.getJumps().get(i)+" m";}
            //System.out.println("index" +i);
        }
        return jumps;
    }
    }


