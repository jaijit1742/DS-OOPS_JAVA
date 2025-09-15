package Arrays;

import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
