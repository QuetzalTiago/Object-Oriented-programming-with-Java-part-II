import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        while(true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Word:");
            String string = reader.nextLine();
            allVowels(string);
        }
    }

    public static boolean isAWeekDay(String string){
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            System.out.println("The form is fine.");
            return true;
        }
        System.out.println("The form is wrong.");
        return false;
    }

    public static boolean allVowels(String string){
        if (string.matches("[aeiouäö]*")){
            System.out.println("The form is fine.");
            return true;
        }
        System.out.println("The form is wrong.");
        return false;
    }

    public static boolean clockTime (String string) {
        return string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}");
    }


}
