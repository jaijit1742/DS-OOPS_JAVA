package Overloading;

class Circle {
    float radius;

    Circle(float r) {
        radius = r;
    }

    void area() {
        System.out.println("The area of the circle is: " + 3.14 * radius * radius);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.14f);
        c1.area();

        Circle c2 = new Circle(4.15f);
        c2.area();
    }
}
