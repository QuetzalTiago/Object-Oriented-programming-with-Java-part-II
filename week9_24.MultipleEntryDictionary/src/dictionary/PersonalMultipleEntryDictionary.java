package dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private HashMap<String, ArrayList<String>> words = new HashMap<String, ArrayList<String>>();
    @Override
    public void add(String word, String entry) {
        try {
            if (words.get(word) == null) {
                words.put(word, new ArrayList<String>());
            }
            words.get(word).add(entry);
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    @Override
    public Set<String> translate(String word) {
        try {
        if (words.containsKey(word)&words.get(word).size()>=1){
            Set<String> i = new HashSet<String>(words.get(word));
            return i; }
            }
        catch(Exception e){ System.out.println("Error!");
    }return null;
}
    @Override
    public void remove(String word) {
        try {
            words.get(word).clear();
        }catch (Exception e){
            System.out.println("Error!");
        }
    }
}
