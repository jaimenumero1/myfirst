package sessions.ifStatements;

import java.util.Scanner;

// Write a program to see if the user is eligible to work
//users under 18 cannot work users over 60 cannot work
public class NestedIfs {
    public static void main(String[] args) {


Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = input.nextInt();
        int minumumRequiredAgeToWork = 18;
        int over60 = 60;
        if (age < minumumRequiredAgeToWork){
            System.out.println("You ar a minor ");
            System.out.println("Not Eligible to work Yet");

        } else if (age >= minumumRequiredAgeToWork  && age < over60){
            System.out.println("You are Eligible to work");
            System.out.println("Please fill in you details and apply");
        }else if (age > over60 && age <= 130 ) {
            System.out.println("You are to old to work as per the government rules");
        }
        else {
            System.out.println("Unreal Age! NOT Human");
        }

        //Simplify

        if (age < minumumRequiredAgeToWork && age > 0) {
            System.out.println("You ar a minor ");
            System.out.println("Not Eligible to work Yet");

        }else if(age>minumumRequiredAgeToWork && age <= 60)
        {System.out.println("You are Eligible to work");
            System.out.println("Please fill in you details and apply");}

        else if(age > 60 && age < 130){
            System.out.println("You are too old to work as per Government rules");
            System.out.println("Please Collect your pension ");
        }
        else {
            System.out.println("Unreal Age NOT Human");
        }


        String savedUserName = "WindyCity";
        String savedPassword = "VeryHardPass123";
        System.out.println("Please Enter use name ");
        String userName = input.next();
        // When working with Strings there is always a need to compare two Strings.

        //Nested if Statement
        // if statements inside another if statement


        //When working with Strings there is always a need to compare two Strings.



        //Nested If Statement
        //If statements inside another if statement.

        //Outer if statements
        if (userName.equalsIgnoreCase(savedUserName)) {

            System.out.println("Please Enter Password");
            String password = input.next();

            //inner if statement
            if (password.equals(savedPassword)){
                System.out.println("You are logged in");
            } else {
                System.out.println("Wrong Password");
                System.out.println("Please try again");
            }

        } else {
            System.out.println("UserName Doest Exist");
        }
        //Out'er if Statement

        // Login Funtionality

        // if user inputs right userName
        //then ask fo password
    }
}
