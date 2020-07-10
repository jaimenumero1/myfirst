package Java_For_Dummies;

import java.util.Scanner;

public class Assignment1$7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int userNumber = input.nextInt();

        String weekday = "";

        if (userNumber == 1) {
            weekday = "Monday";
        }
        if (userNumber == 2) {
            weekday = "Tuesday";
        }
        if (userNumber == 3) {
            weekday = "Wednesday";
        }
        if (userNumber == 4) {
            weekday = "Thursday";
        }
        if (userNumber == 5) {
            weekday = "Friday";
        }
        if (userNumber == 6) {
            weekday = "Saturday";
        }
        if (userNumber == 7) {
            weekday = "Sunday";
        }
        System.out.println(weekday);

    }
}

