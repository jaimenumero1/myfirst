package Mentor_Sessions;

import java.util.Scanner;

public class IncrasingorDecresing {/*Write a program that accepts three numbers from the user and prints “increasing” if the numbers are in increasing order, “decreasing” if the numbers are in decreasing order, and “Neither increasing or decreasing order” otherwise.
Test Data;
Input first number: 1
Input second number: 2
Input third number: 3
Expected Output :
Increasing order*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input first number" );
        int firstNum = input.nextInt();

        System.out.println("input second number");
        int secondNum = input.nextInt();
        System.out.println("input third number");
        int thirdNun = input.nextInt();

        if (firstNum < secondNum &&  secondNum < thirdNun) {
            System.out.println("increasing condition");
        }else if (firstNum > secondNum && secondNum > thirdNun){
            System.out.println("decreasing condition");}
            else {
            System.out.println("neither increasing or decreasing ");

            }
        }



    }
