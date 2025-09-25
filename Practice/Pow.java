package Practice;

public class Pow {
    public static void main(String[] args) {
        int base = 3;        
        int exponent = 2;    
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(result);  
    }
}
