package Constructors;

class Dog{
    String name;
    int age;

    public Dog(String n, int a){
        name=n;
        age=a;
        System.out.println("The name of the dog is: "+name+" and age is: "+ age);
    }
}
public class Q2 {
    public static void main(String[] args) {
        Dog d1=new Dog("GS",14);
        Dog d2=new Dog("Pitbull",75);
    }
}
