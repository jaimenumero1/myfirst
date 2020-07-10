package sessions.ifStatements;

import java.util.Scanner;

public class FirstIfThen {

    public static void main(String[] args) {

        //Write a program which will tell me if I passed the exam
        // passing score is 70
        //if the score is greater say Great Job
        // if the score is less than 70 say tuff job try again


        Scanner input = new Scanner(System.in);
        System.out.println("What is your exam score? ");

        double score = input.nextDouble();

        if (score >= 70) {
            System.out.println("Great! YOU passed the exam! ");
        }
        if (score < 70) {
            System.out.println("Try again! Keep working hard! ");
        }


        //Tell me if the temperature outside is too hot
        //print out "Too Hot" if the temp is hotter than 80F
        //Turn on your AC


        System.out.println("What is temperature outside?");

        double temp = input.nextDouble();

        if (temp >= 80) {
            System.out.println("Temp is \"Too Hot\"");
            System.out.println("Turn on your AC");
        }
        if (temp <= 30) {  //(temp<30 || temp==30)
            System.out.println("Freaking Cold Chicago!");
            System.out.println("Miami wait for me");
        }
        if (temp < 80 && temp > 30) {
            System.out.println("Good weather outside");
            System.out.println("Lets do picnic");
        }
        //Good Morning if the current is less than 11  (00-24)
        System.out.println("What is the current hour?");
        int currentHour = input.nextInt();
        if (currentHour < 11) // when false
            System.out.println("#59 Good Morning"); //this is skipped bc it's part of the if statement
        System.out.println("#60 Go Knockout some goals");//this is printout always bc it's outside of the if statement block
        if (currentHour < 11) {
            System.out.println("Good Morning");
            System.out.println("Go Knockout some goals");
        } else {
            System.out.println("Have Good Day");
        }
//        if(currentHour >= 11) {
//            System.out.println("Have Good Day");
//        }
        //Find out if the number is positive or negative
        System.out.println("Please enter a number and I will tell you if it's positive or negative");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is positive");
        }


    }

}

