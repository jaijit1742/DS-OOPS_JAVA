package VarTypes;

public class StaticVar {
    static int count = 0;
    StaticVar() {
        count++;
        System.out.println("Object created. Count = " + count);
    }

    public static void main(String[] args) {
        StaticVar s1 = new StaticVar();
        StaticVar s2 = new StaticVar();
        StaticVar s3 = new StaticVar();
    }
}
