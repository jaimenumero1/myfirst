package homeworks;

import java.util.Scanner;

public class Homework_If_FloorMeth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double currentNumber2;
        System.out.println("Please Enter a number:");
        double currentNumber = input.nextDouble();

        if (currentNumber % 2 == 0) {
        currentNumber /= 2;
        }
        else {


        currentNumber++;
        }
        System.out.println(currentNumber);
    }
}
