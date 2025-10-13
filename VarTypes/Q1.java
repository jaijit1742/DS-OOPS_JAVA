package VarTypes;

class Book{
    static int count=0;

    Book(){
        System.out.println("Count: "+ count);
        count++;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book();
        Book b3=new Book();
    }
}
