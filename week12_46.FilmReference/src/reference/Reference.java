package reference;

import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

public class Reference {

    private RatingRegister ratings = new RatingRegister();

    public Reference(RatingRegister ratings){
        this.ratings=ratings;
    }

    public Film recommendFilm(Person person) {
        ArrayList<Film> films = new ArrayList<Film>();//films rated by person and p
        ArrayList<Film> finalFilms = new ArrayList<Film>();
        HashMap<Film, List<Rating>> ratingsFinal = new HashMap<Film,List<Rating>>();//ratings for the films
        HashMap<Film, List<Rating>> ratingsFinal2 = new HashMap<Film,List<Rating>>();//ratings for the films
        for (Person p : ratings.reviewers()) {// goes threw reviewers
            for (Film f : ratings.filmRatings().keySet()) {// goes threw film ratings
                if (ratedSameFilm(person, p, f)) {// checks if person and p rated the same film
                    films.add(f);
                    ratingsFinal.put(f,ratings.getRatings(f));
                }
            }
        }

        for(Film f: ratings.filmRatings().keySet()){
            if(!films.contains(f)){
                finalFilms.add(f);
            }
            if (!ratingsFinal.containsKey(f)){
                ratingsFinal2.put(f,ratings.getRatings(f));
            }
        }
        FilmComparator comparator = new FilmComparator(ratingsFinal2);
        Collections.sort(finalFilms, comparator);
        try{
            return finalFilms.get(0);
        }catch (Exception e){
            return null;
        }



    }

    public int getSimilarity(Person p, Person p1, Film f){
        int similarity=0;
        int r1 = ratings.getRating(p,f).getValue();
        int r2 = ratings.getRating(p1,f).getValue();
        similarity = r1*r2;
        return similarity;
    }

    public boolean ratedSameFilm(Person p, Person p1, Film film){
            if (ratings.getPersonalRatings(p).keySet().contains(film)){
                if(ratings.getPersonalRatings(p1).keySet().contains(film)) {
                    return true;
                }
        }return false;

    }

}
