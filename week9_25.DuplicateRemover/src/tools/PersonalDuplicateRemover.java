package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> uniques = new HashSet<String>();
    private int duplicates = 0;
    @Override
    public void add(String characterString) {
        try {
            if (unique(characterString)){
                uniques.add(characterString);
                //System.out.println("unique");
            }else{
                duplicates++;
            }
        }catch (Exception e) {
            System.out.println("error");
        }

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniques;
    }

    @Override
    public void empty() {
        uniques.clear();
        duplicates = 0;

    }

    public boolean unique(String myString){
        if (uniques.contains(myString)){
            return false;
        }else{
            return true;}
    }
}
