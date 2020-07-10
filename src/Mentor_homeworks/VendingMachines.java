package Mentor_homeworks;

import java.util.Scanner;

public class VendingMachines {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter change....");
        /* Note to self always remember that java runs from top to bottom.
        This Mentoring explains compound operators and Java operation
         */
        int change = input.nextInt();// This line is normal starting point for Scanner-console input

        int quarters, dimes, nickels, pennies, changeLeft;// This just declares the integers. Integers
        // will further be defined in subsequent lines

        quarters = change / 25; // This line divides quarters from original change inputed by console

        changeLeft = change%25;// This  integer was declared in line 16 here we are
        dimes = changeLeft /10;
        changeLeft %=10;
        nickels = changeLeft/5;
        pennies = changeLeft%5;

        System.out.println("Change Remaining : ");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: "+pennies);


    }
}
