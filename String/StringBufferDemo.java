package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hello");
        StringBuffer sb3 = new StringBuffer(25);

        sb3.append("Hi");
        sb1.insert(0, "Bye Bye");

        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb1);
    }
}
