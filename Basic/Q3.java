package Basic;

class Person {
    private String address;  
    public void setAddress(String addr) {
        address = addr;
    }

    public void printAddress() {
        System.out.println("Address: " + address);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAddress("Punjab");

        p1.printAddress();
        // System.out.println(p1.address); 
    }
}
