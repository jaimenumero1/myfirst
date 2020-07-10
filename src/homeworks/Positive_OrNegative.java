package homeworks;

import java.util.Scanner;

public class Positive_OrNegative {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a Number ");

        int number1 = input.nextInt();

        if (number1 > 0) {
            System.out.println("Number is positive ");

        }
        if (number1 < 0){
            System.out.println("Number is negative ");
        }

    }
}
