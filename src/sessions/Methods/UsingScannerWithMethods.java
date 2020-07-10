package sessions.Methods;

import java.util.Scanner;

public class UsingScannerWithMethods {

    //If I need to take input from user
    //and use the values entered from user
    //to run(call) methods
    public static void main(String[] args) {
        //ask user to give you his car kilometreage
        //then return the mileage

        System.out.println("Please enter kms");
        Scanner sc = new Scanner(System.in);

        //Why I have to take int?
        double kilometre = sc.nextDouble();

        //We can pass hard coded values to method params
        //and variables that are of the same data type.
        double mileAgeResult = getMeCarMileage(kilometre);
        System.out.println(mileAgeResult);
    }

    public static double getMeCarMileage(double km) {
        return km / 1.60934;
    }



}
