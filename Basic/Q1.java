package Basic;

class Car {
    String make;
    int year;

    public String show() {
        return make + " was made in " + year;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Car c1 = new Car();   
        c1.make = "Volvo";
        c1.year = 1945;

        System.out.println(c1.show());
    }
}
