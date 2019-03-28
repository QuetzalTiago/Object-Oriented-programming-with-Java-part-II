public class Main {
    public static void main(String[] args) {
        // Test your code here!
    Box outerBox = new Box(20); 
    Box innerBox = new Box(10); 
    outerBox.add(innerBox);
    innerBox.add( new Book("Horstman", "Core Java",5) );
    System.out.println(outerBox.weight());
  //expected:<5.0> but was:<0.0>
    }}

