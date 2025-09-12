package Patterns;
import java.util.Scanner;
public class spacePyramid {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n+1-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        input.close();
    }
}
