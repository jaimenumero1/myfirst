package sessions.operators;

import java.util.Scanner;

public class UserInputPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a number in double format ");
        // it will wait for the user to give a double value
        // give values on the fly. during run time.
        // what is the value of num1?
        // whatever the user inputs
        double num1 = input.nextDouble();

        // if the user puts invalid stuff in the console java will report a error.

        System.out.println("Number Entered : " + num1);

        System.out.println("Please Enter you first name ...");
        String firstname = input.next();
        System.out.println("Your Full name: " + firstname);
        System.out.println("Enter Your Last Name ");
        String lastName = input.next();
        System.out.println("Your Last Name : ");

        System.out.println("Enter your Gender: ");
        char gender = input.next().charAt(0);
        System.out.println("Your Gender: " + gender);

        System.out.println("Enter your full name: ");

        input.next();
        // when using nextline after other scanner methods we have to run input nextline
        // before the actual next lin. problem is that all methods other than nextline () nextInt(), next()
        // they only take one word or number from the user and the rest of the line is left hanging
        // by running nextline() we take the re
        input.nextLine();
        String fullName = input.nextLine();

        System.out.println("Full Name: " + fullName);


    }
}
