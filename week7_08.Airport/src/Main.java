
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        String input = "1\n" + "AY-123\n" + "108\n"
                + "2\n" + "AY-123\n" + "HEL\n" + "TXL\n" + "x\n"
                +"2\n" + "x\n";
        Scanner reader = new Scanner(System.in);
        UI ui = new UI(reader);
        ui.start();
    }
}


