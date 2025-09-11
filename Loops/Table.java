import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     int num=input.nextInt();
     if(num==0){
        System.out.println("Please enter a non-zero value");
        System.exit(0);
     }
     else if(num<0){
        System.out.println("Please enter a positive value");
        System.exit(0);
     }
     else{
     for(int i=1;i<=10;i++){
        System.out.println(num +" X "+ i+ " = "+ num*i);
     }   }
    }
}