package reference.comparator;

import reference.domain.Film;
import reference.domain.Rating;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FilmComparator implements Comparator<Film> {

    private Map<Film,List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings){
    this.ratings=ratings;
    }

    @Override
    //This method returns the value zero if (x==y),
    //if (x < y) then it returns a value less than zero
    //and if (x > y) then it returns a value greater than zero.
    public int compare(Film film, Film t1) {
        if (getAvg(film)==getAvg(t1)){
            return 0;
        }
        else if(getAvg(film)<getAvg(t1)){
            return 1;
        }return -1;
    }

    public int getAvg(Film film){
        int avg = 0;
        int total =0;
        for (Rating r:ratings.get(film)){
            avg+=r.getValue();
            total++;
        }
        avg=avg/total;
        return avg;
    }
}
