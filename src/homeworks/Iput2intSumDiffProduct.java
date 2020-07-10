package homeworks;

import java.util.Scanner;

public class Iput2intSumDiffProduct {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter First number: ");

        int num1 = input.nextInt();
        System.out.println("Please Enter Second number ");
        int num2 = input.nextInt();
        int distance = Math.abs(num1 - num2);

        System.out.println("Sum of two Integers: " + (num1 + num2));
        System.out.println("Difference of two integers: " + (num1 - num2));
        System.out.println("Product of two integers: " + (num1 * num2));
        System.out.println("Average of two integers: " + (double)(num1 + num2) / 2);
        System.out.println("Distance of two integers: " + distance);

        int maxNumber = Math.max(num1,num2);
        System.out.println("Max integer: " + maxNumber);
        int minNumber = Math.min(num1,num2);
        System.out.println("Min integer: " + minNumber);


    }
}
