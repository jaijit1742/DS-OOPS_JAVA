package MultiD_Arrays;

import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int r=input.nextInt();
    int c=input.nextInt();

    int [][]arr=new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            arr[i][j]=input.nextInt();

        }
    }

    for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=0;j<arr[i].length;j++){
            sum+=arr[i][j];
           
        }
         System.out.println("Sum of row "+i+ ": "+sum);
    }
}   
}
