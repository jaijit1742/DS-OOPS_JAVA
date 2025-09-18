package Recursion;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println(fact(num));
    }

    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
