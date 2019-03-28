
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<String>();
        File newFile = new File(file);
        Scanner reader = new Scanner(newFile);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            words.add(line);
            //System.out.println(line);
            }
        return words;
    }

    public void save(String file, String text) throws IOException, FileNotFoundException {
        //Scanner reader = new Scanner(text);
        File newFile = new File(file);
        FileWriter writer = new FileWriter(newFile, true);
        for (String line : read(text)) {
            writer.write(line+"\n");
            //System.out.println(line+": added");
        }
        writer.close();
        //FileWriter fileWriter = new FileWriter(file);
        //        fileWriter.write(text);
        //        fileWriter.close();

    }

    public void save(String file, List<String> texts) throws IOException, FileNotFoundException {
        //Scanner reader = new Scanner(file);
        File newFile = new File(file);
        FileWriter writer = new FileWriter(newFile, true);
        for (String line : texts) {
            writer.write(line+"\n");
        }
        writer.close();

    }
}
