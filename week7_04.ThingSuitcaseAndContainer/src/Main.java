
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    public static void addSuitcasesFullOfBricks(Container container){
        for(int i = 1;i<101;i++){
        Thing brick = new Thing("Brick", i);
        Suitcase bricksCase = new Suitcase(100);
        bricksCase.addThing(brick);
        container.addSuitcase(bricksCase);
            //System.out.println(brick.getWeight());
           // bricksCase.printThings();
            //System.out.println(bricksCase.getWeight());
        }
    }
}
            
            