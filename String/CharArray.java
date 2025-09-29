package String;

public class CharArray {
    public static void main(String[] args) {
        String s1="Hello";
        char[] s2=s1.toCharArray();
        s2[0]='J';
        System.out.println("The original array: "+ s1);
        System.out.println("The modified array: "+ new String(s2));
    }
}
