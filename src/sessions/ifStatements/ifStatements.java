package sessions.ifStatements;

import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {


        //    If Statements I should copy it into intellij
        //When I have a chance

        String userName = "Admin";
        String password = "DifficultPass";

        if (userName.equals("Admin")) {
            System.out.println("Right userName");
        }

        if (password.equals("DifficultPass")) {
            System.out.println("Right Pass");
        }


        //Grading App
        ///Write an app which will give a grade based on my Score
        //0-  60   - F
        //61 -70 -   D
        // 71 - 80 - C
        // 81 - 90 - B
        //91  -100 - A
        //anything out of this range printout Invalid score Or You are too genius

        Scanner input = new Scanner(System.in);
        System.out.println("What is the exam Score?");

        int testScore = input.nextInt();

        //Only one if statement in the group
        //IF statement Comes in the very beginning
        //it indicates the starting of the group
        if (testScore >= 0 && testScore <= 60) {
            System.out.println("F");
        } else if (testScore >= 61 && testScore <= 70) { //Any number of else ifs are allowed
            System.out.println("D");
        } else if (testScore >= 71 && testScore <= 80) {
            System.out.println("C");
        } else if (testScore >= 81 && testScore <= 90) {
            System.out.println("B");
        } else if (testScore >= 91 && testScore <= 100) {
            System.out.println("A");
        }
        //Else comes in at the end of the group
        // it indicates the ending of the group
        //only one else per group
        //else is usually used to handle invalid behaviours, inputs
        else {

            System.err.println("Invalid Input! Too genius!");
        }


    }
}
