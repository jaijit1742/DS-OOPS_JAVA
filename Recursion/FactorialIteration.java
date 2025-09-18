package Recursion;

import java.util.Scanner;

public class FactorialIteration{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int product=1;
        for(int i=1;i<=num;i++){
            product*=i;
        }
        System.out.println(product);
    }
}