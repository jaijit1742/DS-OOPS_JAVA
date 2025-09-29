package String;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {

        String str1 = "Hello";
        System.out.println(str1); 

        char[] charArray = str1.toCharArray();
        System.out.println("Direct print: " + charArray); // Hello
        System.out.println("Arrays.toString(): " + Arrays.toString(charArray)); 
        System.out.println(str1.toString());
        String strConcat = str1.concat(" World");
        System.out.println(strConcat); 

        char[] str2 = {'H', 'I'};
        System.out.println(str2);
    }
}