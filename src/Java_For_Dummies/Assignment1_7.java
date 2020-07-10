package Java_For_Dummies;

import java.util.Scanner;

public class Assignment1_7 {

    public static void main(String[] args) {
        System.out.println("Enter a number from 1-7:");
        Scanner input = new Scanner(System.in);

        int userNumber = input.nextInt();
        String weekday = "";

        switch (userNumber) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
        }
            System.out.println(weekday);
    }
}

