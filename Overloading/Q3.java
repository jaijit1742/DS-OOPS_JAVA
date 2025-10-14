package Overloading;

class DisplayDemo {
    void display(int number) {
        System.out.println("Displaying integer: " + number);
    }
    void display(String text) {
        System.out.println("Displaying string: " + text);
    }
}

public class Q3 {
    public static void main(String[] args) {
        DisplayDemo obj = new DisplayDemo();

        obj.display(10);          
        obj.display("Hello Java"); 
    }
}
