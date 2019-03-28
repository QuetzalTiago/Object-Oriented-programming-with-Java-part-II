package personnel;

import static personnel.Education.D;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Employees t = new Employees();
        Person h = new Person("Arto", D);
        t.add(h);
        System.out.println(h.getEducation());
        t.print(D);
    }

}
