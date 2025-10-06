package Basic;

class Person {        
    String name;
    int age;

    public String getData() {
        return "Name: " + name + "\nAge: " + age;
    }
}

public class Output {   
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="Rohit";
        p1.age=45;
        System.out.println(p1.getData());
    }
}
