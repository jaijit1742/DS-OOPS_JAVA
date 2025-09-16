package MultiD_Arrays;
import java.util.*;

public class ColSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int r = input.nextInt(); 
        int c = input.nextInt(); 

        int[][] arr = new int[r][c];

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }

      
        for (int col = 0; col < c; col++) { 
            int sum = 0;
            for (int row = 0; row < r; row++) {  
                sum += arr[row][col];
            }
            System.out.println("Sum of column " + col + ": " + sum);
        }
    }
}
