package Practice;

public class KeyValue {

    public static void main(String[] args) {
        for (int i = 0; i < args.length - 1; i += 2) {
            String key = args[i];
            String value = args[i + 1];
            System.out.println(key + " : " + value);
        }
    }
}