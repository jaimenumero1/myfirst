package Mentor_Sessions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year = input.nextInt();
        boolean isLeapYear;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) isLeapYear = true;


    }
}
