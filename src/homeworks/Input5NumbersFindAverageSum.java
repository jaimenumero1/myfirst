package homeworks;

import java.util.Scanner;

public class Input5NumbersFindAverageSum {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers :");


        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        int sum = a +b + c + d + e;

        System.out.println(" The Sum is : " + sum);
        System.out.println();
        double average = (double)sum / 5.0;
        System.out.println(" The average is: " + average);
    }
}
