package Mentor_Sessions;

import java.util.Scanner;

public class Danila_InputThreeDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input first number");
        int firstNum = input.nextInt();
        System.out.println("input second number");
        int secondNum = input.nextInt();
        System.out.println("input third number");
        int thirdNumber = input.nextInt();

        if (firstNum == secondNum && firstNum == thirdNumber) {
            System.out.println("all numbers are equall");
        } else if ((firstNum == secondNum) || (firstNum == thirdNumber) || (thirdNumber == secondNum)) {
            System.out.println("two are equall");
        } else {
            System.out.println("all numbers are different");
        }
    }
}
