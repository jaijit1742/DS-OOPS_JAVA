package Linear_Search;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();      
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt(); 
        }
        int key = input.nextInt();  
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index != -1)
            System.out.println(index);
        else
            System.out.println("Not Found");

        input.close();
    }
}
