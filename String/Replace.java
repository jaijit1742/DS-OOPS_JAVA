package String;

public class Replace {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = "";
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result += "*";
            } else {
                result += ch;
            }
        }
        
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }
}
