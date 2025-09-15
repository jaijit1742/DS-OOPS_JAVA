package Arrays;

import java.util.Scanner;

public class UserChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }

        int choice;
        do {
            System.out.println("1. Update");
            System.out.println("2. Delete");
            System.out.println("3. Print");
            System.out.println("4. Exit");
            choice = input.nextInt();

            if (choice == 1) { 
                int index = input.nextInt();
                int value = input.nextInt();
                if (index >= 0 && index < num) {
                    arr[index] = value;
                }
            } 
            else if (choice == 2) {
                int index = input.nextInt();
                if (index >= 0 && index < num) {
                    for (int i = index; i < num - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    num--;
                }
            } 
            else if (choice == 3) { 
                for (int i = 0; i < num; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

        } while (choice != 4);

        input.close();
    }
}
