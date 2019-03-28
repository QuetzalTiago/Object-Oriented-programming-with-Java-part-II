import java.util.Scanner;

public class Reader {
    private Scanner reader = new Scanner(System.in);
    public Reader(Scanner reader){
        this.reader=reader;
    }
    public String read(){
        String input = reader.nextLine();
        return input;
    }

}

