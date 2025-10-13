package VarTypes;

class Student {
    static int count = 0;
    Student() {
        count++;
    }

    static void showCount() {
        System.out.println("Total students: " + count);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student.showCount();
    }
}
