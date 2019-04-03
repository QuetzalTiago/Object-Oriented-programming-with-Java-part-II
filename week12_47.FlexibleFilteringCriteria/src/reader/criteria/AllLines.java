package reader.criteria;

public class AllLines implements Criterion{

    private String word;

    public AllLines(){

    }

    @Override
    public boolean complies(String line) {
        return true;
    }
}
