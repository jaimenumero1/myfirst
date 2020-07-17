package Sprint;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExceptions {
    public static void main(String[] args) {
try {


    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is Designed to catch Exeption's");
        System.out.println("The next input will be a integer input however please enter letter");
        int num = sc.nextInt();
        sc.nextLine();
    } catch (InputMismatchException e) {
        System.out.println("Thank you for entering a letter");
        System.out.println("The Exception was caught!!!");
    }


    try {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("The next exception to test is a Arithmetic exception");
        System.out.println("Please enter 2 numbers first number above zero");

        int num1 = sc.nextInt();
        System.out.println("And second number Please enter zero, to cause the Exception");
        int num2 = sc.nextInt();
        int new3 = num1 / num2;

    } catch (ArithmeticException e) {
        System.out.println("Thank you!!!\nDivide by zero Exception has been caught");
        System.out.println("Thank you!!! for Participating In this Exception Experiment");
    }

}catch (Exception e) {
    System.err.println("A General Exception has been caught Please Rerun Program ");
    System.err.println("Please Rerun Program and Help Us out again");

}
//        finally {
//    System.out.println("Thank you for Participating In this Exception Experiment");
//        }


    }
}
