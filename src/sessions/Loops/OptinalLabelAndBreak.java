package sessions.Loops;

import java.util.Scanner;
public class OptinalLabelAndBreak {
    //break statement can be used to stop(exit, terminate) the
    // loop at any time
    public static void main(String[] args) {
        //Print out hello 10 times
        for (int i = 1; i <= 10; i++) { //i++;
            System.out.println("Hello");
            break;                      //break statement terminates the loop
                                        //return statement specifies the end of the method
                                        //return stops the whole method.
        }
        //password example
//        int expectedPassword = 1234;
//        Scanner sc = new Scanner(System.in);
//
//        int password = 34;
//        int count = 0;
//
//        do {
//            System.out.println("please enter your password");
//            password = sc.nextInt(); //update statement   ==> 2323
//            count++;
//            if (expectedPassword != password) {
//                if (count >= 3){
//                    System.out.println("You are blocked");
//                    break;
//                }
//            }else {
//                System.out.println("Logged in");
//            }
//        } while (expectedPassword != password);
        //you have stream of shoes. There are 100 of them. you need to choose one of them based on a number.
        //shoe is number 25; => I want say great choice and stop the loop.
        for (int i = 1; i <= 100; i++) {
            System.out.println("Loop number " + i);
            if (i == 25) {
                System.out.println("great choice");
                break;
            }
            System.out.println("Loop number " + i + " end of the loop");
        }
        //Given a String print a program to print out each character of the String until you see x.
        //ex: SpaceX
        //    Space
        //    DevX School
        //    Dev
        String str = "ReXX";
        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i) == 'X') {
                break;
            }
            System.out.println(str.charAt(i));
        }
        //Write a program which will find me first number evenly divisible by 13. 
        //number is between 0 and 100
        
        
    }
}
