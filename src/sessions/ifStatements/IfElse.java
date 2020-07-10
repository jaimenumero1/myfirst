package sessions.ifStatements;

import java.util.Scanner;

public class IfElse {
    //Find a possitive or a Negative
    public static void main(String[] args){

        int userGivenNumber = 10;

        if ( userGivenNumber > 0) {
            System.out.println("Number is positive ");

        }
        else if (userGivenNumber == 0){

        }
        else {
            System.out.println(" Number is negative ");// Can be rewritten with only ifs/ but more typing
                                                        // If first if is true, then Java skips all else Statements
        }

        int age = 9;
        // tell the user if he /she eligible to vote;
        // tell the user ho long they have to wait to vote
        // this is th rewrite of the code using only ifs
        if (age >=18) {
            // Send them an email
            // Else and if Else statements save nano seconds of Java Runtime

            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println(" Not eligible to vote yet");
            int yearsToWait = 18 - age;
            System.out.println("You have to wait for " + yearsToWait + " more years");
        }

        if (age >=18) {
            // Send them an email
            System.out.println("You are eligible to vote");}


        String userName = "Admin";
        String password = "Difficulties";

        if ( userName == "Admin"){

        } else {


        }
        // Cars
        // I want to know if the car is luxury car
        // sports car
        //economy
        // SUV
        // Not a Car

        // toyota <=  Strings cannot be compared using comparing signs =>
        // >   <
        // Toyota is every thing is just characters, they cannot emagine A Car
        // str.equalsIgnoreCase ("Toyota"
        // str.equals will give me toyota false case sensative
        Scanner input = new Scanner(System.in);
        String userInputForACar = input.next();
        if (userInputForACar.equalsIgnoreCase("Ferrari ") || userInputForACar .equalsIgnoreCase("Lambo")){
            System.out.println("sports Car");}

            else if (userInputForACar.equalsIgnoreCase("Ram")){
            System.out.println("SUV ");
            }
            else if (userInputForACar.equalsIgnoreCase("Toyota ")){
            System.out.println("Economy ");
            }
            else if (userInputForACar.equalsIgnoreCase("Cadillar ")) {
            System.out.println("Luxury ");
            }
            else {
            System.out.println("Not a Car ");
        }

            // Please writ a code which will adk the user to give an input.
        //Tell user please enter on of the followin:
        //1. SUV
        //2. Sports Cars
        //3. Economy
        //4. Luxury
        // Invalid Entry. No such car
        //
        //then --> program should list all the Cars from the choice
        //ex: Sports Cars




        }
}
