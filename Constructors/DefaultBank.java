package Constructors;

class Initialize {
    String name;
    int accNo;

    public Initialize() {
        name = "Abhi";
        accNo = 0;
        System.out.println("Default constructor called");
    }
}

public class DefaultBank {
    public static void main(String[] args) {
        Initialize p1 = new Initialize();  
        System.out.println("Name: " + p1.name);
        System.out.println("Account Number: " + p1.accNo);
    }
}
