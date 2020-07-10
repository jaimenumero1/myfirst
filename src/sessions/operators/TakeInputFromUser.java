package sessions.operators;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TakeInputFromUser {

        //Good program : without having to change the code program should be able to run for different
        // many different scenarios

    public static void main(String[] args) {
        // we need to initialize Scanner Class in order
        // to be able to take input from user
        // from console.

        Scanner input = new Scanner(System.in);


        // We can writeprograms and make them dynamic
        //so that one algorithim (logic) works for many different inputs
        // inputs is values
        // write a program for grocery store checkpoin
        System.out.println("Please Enter Product Price");
        double productPrice = input.nextDouble();
        double taxPercent = 10.25;
        double tax = productPrice * taxPercent / 100;

        double total = productPrice + tax;
        //

        //round to two decimal points
        //Make sure you have import java.text.DecimalFormat; in the beginning of the file.

        DecimalFormat decimalFormatter = new DecimalFormat(".00");
        System.out.println("Your Total: " + decimalFormatter.format(total));
    }
}
