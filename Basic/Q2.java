
package Basic;

class Car {
    private String model = "Tesla";
    public String getModel() {
        return model;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        // System.out.println(c1.model);  
        System.out.println("Car model: " + c1.getModel());
    }
}
