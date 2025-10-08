package Constructors;

class Initialize {
    String name;
    int accNo;
    public Initialize(String n, int a) {
        name = n;
        accNo = a;
        System.out.println("Parameterized constructor called");
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
    }
}

public class ParameterBank {
    public static void main(String[] args) {
        Initialize p1 = new Initialize("Denver", 123456);
        p1.showDetails();
    }
}
