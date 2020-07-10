package homeworks;

import java.util.Scanner;

public class TemperatureConverter {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Fahrenheit Temperature: ");

        int fahrenheit = input.nextInt();
        int inputTemperature = fahrenheit;
        fahrenheit = (fahrenheit - 32) * 5 / 9;

        System.out.println(inputTemperature + " degree Fahrenheit is equal to " + fahrenheit + " degrees in Celsius");
        System.out.println();

                                //Meter Calculator
        System.out.println("Please Enter Number of inches ");

        int numberOfInches = input.nextInt();

        double numberOfMeters = numberOfInches * .0254;

        System.out.println(numberOfInches+ " inch is " + numberOfMeters + " meters");










    }
}






