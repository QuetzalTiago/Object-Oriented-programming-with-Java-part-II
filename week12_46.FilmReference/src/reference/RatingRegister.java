package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {

    HashMap<Film, List<Rating>> ratings = new HashMap<Film, List<Rating>>();
    HashMap<Person, Map<Film,Rating>> personalRatings = new HashMap<Person, Map<Film,Rating>>();

    public RatingRegister(){

    }

    public void addRating(Film film, Rating rating){
        if (ratings.containsKey(film)){
            ratings.get(film).add(rating);
        }else{
        ArrayList<Rating> ratingArray = new ArrayList<Rating>();
        ratingArray.add(rating);
        ratings.put(film, ratingArray);}
    }

    public void addRating(Person person, Film film, Rating rating){
        if (personalRatings.containsKey(person)) { //find person
            personalRatings.get(person).put(film, rating);//add rating personalRatings
            addRating(film,rating);
        }else{
            HashMap<Film,Rating> personRatings = new HashMap<Film,Rating>();
            personRatings.put(film,rating);
            personalRatings.put(person,personRatings);
            addRating(film,rating);
        }
    }

    public List<Rating> getRatings(Film film){
        return ratings.get(film);
    }

    public Rating getRating(Person person, Film film){
        if (personalRatings.containsKey(person)) {
            if (personalRatings.get(person).containsKey(film)) {
                return personalRatings.get(person).get(film);
            }
        }return Rating.NOT_WATCHED;

    }

    public Map<Film, Rating> getPersonalRatings(Person person){
        if (personalRatings.containsKey(person)) {
            return personalRatings.get(person);
        }else{
        HashMap<Film, Rating> noRatings = new HashMap<Film,Rating>();
        return noRatings;}
    }

    public Map<Film, List<Rating>> filmRatings(){
        return ratings;
    }

    public List<Person> reviewers(){
        ArrayList<Person> reviewers = new ArrayList<Person>();
        for (Person p: personalRatings.keySet()){
            reviewers.add(p);
        }
        return reviewers;
    }

}
