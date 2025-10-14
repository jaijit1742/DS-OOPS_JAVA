package Overloading;

class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student s1 = new Student("Jaijit", 19);
        s1.showDetails();
    }
}
