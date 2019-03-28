package validation;

public class Person {

    private String name;
    private int age;
    //name==null&name==""&name.length()>40&age<0&age>120
    public Person(String name, int age) {
        if (name==null) {
            throw new IllegalArgumentException();
        }else if (name==""){
            throw new IllegalArgumentException();
        }else if (name.length()>40){
            throw new IllegalArgumentException();
        }else if (age<0){
            throw new IllegalArgumentException();
        }else if (age>120){
            throw new IllegalArgumentException();
        }
        else{
        this.name = name;
        this.age = age;}
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
