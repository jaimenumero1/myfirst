package homeworks;

import java.util.Scanner;

public class NestedLoopsPrac {

    public static void main(String[] args) {
        // Declare variables
        int numItems = 0;
        int[] items;  // Declare array name, to be allocated after numItems is known
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of num items in an array (a non-negative integer)");
        numItems = scanner.nextInt();
        items = new int[numItems];
        System.out.println("Please enter values of all the items (non-negative integers)");
        for(int i = 0; i < items.length; i++) {
            int userInput = scanner.nextInt();
            items[i] = userInput;
        }
        // Print array in "index: number of stars" using a nested-loop
        // Take note that rows are the array indexes and columns are the value in that index
        for (int idx = 0; idx < items.length; ++idx) {  // row
            System.out.print(idx + ": ");
            // Print value as the number of stars
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // column
                System.out.print("*");
            }
            System.out.println("(" +  items[idx] + ")");
        }
    }











}
