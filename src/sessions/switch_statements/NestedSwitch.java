package sessions.switch_statements;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) { //What classes does a student need to take?
        //ask for the nth year?
        //for first year(freshman) printout(AdvancedEnglish and Algebra)
        //for second,third or 4th years
        //we have three majors. ask the user to input the major
        //CS -> print out (CS Fundamentals, Java 1, Java 2)
        //ACC -> print out (Statistics, Excel)
        //BA  -> print out(Marketing, Read some good books)

        //if the user input a number smaller than 1 tell too early to think about college
        //if the user input a number greater than 4 tell it's time to work.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year you are on");
        int academicYear = input.nextInt();

        switch (academicYear) {
            case 1:
                System.out.println("Freshmen curriculum: \n1) Advanced English");
                System.out.println("2) Algebra");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Please Enter your major");

                input.nextLine();
                String major = input.nextLine();

                switch (major.toUpperCase()) { //acc,AcC-Acc-aCC -> ACC
                    case "CS": //cs
                        System.out.println("S Fundamentals, Java 1, Java 2");
                        break;
                    case "ACC": //acc
                        System.out.println("Statistics, Excel");
                        break;
                    case "BA": //ba
                        System.out.println("Marketing, Read some good books");
                        break;
                    default:
                        System.out.println("No such major");
                }
                break;
            default:
                if (academicYear < 1) {
                    System.out.println("too early to think about college");
                } else {
                    System.out.println("It's time to work");
                }

                //Write a program
        }
    }
}