package sessions.switch_statements;

import java.util.Scanner;

public class TestApplication {

    public static void main(String[] args) {
        //Printout a queshtion
        //prin out 4 answers



            //Printout a question
            //print out 4 answers
            //ex: What is the cutoff for air pollution?
            //   a) 1.2
            //   b) 2.2
            //   c) 3.5 => correct answer
            //   d) 0

            // user input(choice) b
            // b,a,d => wrong answer in red
            // c => correct answer
            //invalid input for invalid input

            Scanner input = new Scanner(System.in);

            System.out.println("What is the cutoff for air pollution?");
            System.out.println("a) 1.2");
            System.out.println("b) 2.2");
            System.out.println("c) 3.5");//Correct
            System.out.println("d) 0");

            char answer = input.next().charAt(0);

            switch (answer) {
                case 'a':
                case 'A':
                case 'b':
                case 'B':
                case 'd':
                case 'D':
                    System.err.println("Wrong Answer");
                    break;
                case 'c':
                case 'C':
                    System.out.println("Correct");
                    break;
                default:
                    System.out.println("Invalid input");
            }




        }


    }

