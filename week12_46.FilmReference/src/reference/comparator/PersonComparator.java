package reference.comparator;

import reference.domain.Person;

import java.util.Comparator;
import java.util.Map;

public class PersonComparator implements Comparator<Person> {
    private Map<Person, Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities){
        this.peopleIdentities=peopleIdentities;
    }

    @Override
    //This method returns the value zero if (x==y),
    //if (x < y) then it returns a value less than zero
    //and if (x > y) then it returns a value greater than zero.
    public int compare(Person person, Person t1) {
        if(peopleIdentities.get(person).equals(peopleIdentities.get(t1))){
            return 0;
        }
        else if (peopleIdentities.get(person)<peopleIdentities.get(t1)){
            return 1;
        }return -1;
    }
}
