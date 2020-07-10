package Mentor_Sessions;

import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {


        //widely used Math functions
    /*
    Task #1
    Step 1. Ask user to input any number
    Step 2. Display the square root of that number
    Example: Please enter a number: 16
    The square root of 16 is 4
    Hint: use Math.sqrt(double a)
     */
        System.out.println();
        Scanner input = new Scanner(System.in);

        double num = input.nextDouble();


    /*
    Task #2
    Step 1. Ask user to input 3 numbers
    Step 2. Display the maximum number entered
    Example: Please enter 3 numbers: 4 7 23
    Output: The maximum number is 23
    Hint: use Math.max(int a, int b)
     */
    /*
    Task #3
    Step 1. Ask user to input the base number
    Step 2. Ask user to input the power number
    Step 3. Display the result of base number taken to the power of power number
    Example: Enter base number: 2
            Enter power number: 3
            Output: 2 to the 3rd power is 8
            Hint: 2 to the 3rd power is 2 * 2 * 2 = 8
            use Math.pow( int a, int b)
     */



        System.out.println("Please Enter base number");
    int baseNumber = input.nextInt();

        System.out.println("please Enter power number");
        int powerNumber = input.nextInt();

        double result = Math.pow(baseNumber,powerNumber);
        System.out.println(result);


        System.out.println("");
    /*
    Task # 4
    Generate a random 1 digit number
    Generate a random 2 digit number
    Generate a random 3 digit number
    Hint: use Math.random() - it returns a number between 0.0 and 1

        //Task #5
        int i = 4;
        int j = 21;
        int k = ++i * 7 + 2 - j--;//
        System.out.println("k = " + k);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //Task #6
        int a = 7;
        int b = 10;
        int c = a++ + ++b; // c = ? a = ? b = ?
        int d = --a + --b + c--; // d = ? a = ? b = ? c = ?
        int e = a + ++b + c++ + d--;//e = ? a = ? b = ? c = ? d = ?
        int f = -a + b-- + -c - d++;// f = ? a = ? b = ? c = ? d = ?
        int sum = a + b + c + d + e + f;
        System.out.println("sum = " + sum); //92 */

    }
}
