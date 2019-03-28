import java.util.*;

public class RingingCentre {

    private Map<Bird, List<String>> observations = new HashMap<Bird, List<String>>();

    public void observe(Bird bird, String place){
        if (!observations.containsKey(bird)){
            ArrayList<String> places = new ArrayList<String>();
            places.add(place);
            observations.put(bird, places);
        }else if (!observations.containsValue(place)){
            observations.get(bird).add(place);}
    }

    public void observations(Bird bird){
        if (!observations.containsKey(bird)) {
            observations.put(bird, null);}
        for (Bird key : observations.keySet()) {
            if (key.equals(bird)) {
                if (!(observations.get(bird)==null)) {
                    System.out.println(key + " observations: " + observations.get(bird).size());
                    for (int i = 0;i<observations.get(bird).size();i++){
                        System.out.println(observations.get(bird).get(i));
                    }
                }else{
                    System.out.println(key + " observations: " + "0");
                }
            }
        }
    }




}
