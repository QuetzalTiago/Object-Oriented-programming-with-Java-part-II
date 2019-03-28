import java.util.Comparator;
import java.util.Objects;

public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public int getRingingYear(){
        return this.ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override public boolean equals(Object other){
        if (other instanceof Bird){
            if (this.latinName==((Bird) other).latinName&&this.ringingYear==((Bird) other).ringingYear){
                return true;
            }
        }return false;
    }

    @Override public int hashCode(){
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.ringingYear);
        hash = 31 * hash + Objects.hashCode(this.latinName);
        //hash = 31 * hash + Objects.hashCode(this.name);
        return hash;
    }




}




