package sessions.Loops;

import java.util.Scanner;
public class WhileLoop {
    //print out Hello world 10 times
    public static void main(String[] args) {
        int numOfHello = 10;
        int loopCount = 0;
        while (numOfHello > loopCount) {
            System.out.println("Hello");
            loopCount++;
        }
        //count the sum of numbers starting from 1 till 12;
        //15+6+7+etc
        int lastNum = 12;
        int loopCount1 = 1;
        int sum = 0;
        while (loopCount1 <= lastNum) {
            sum = sum + loopCount1;
            System.out.println(sum);
            loopCount1++;
        }
        System.out.println(sum);
        //write a program to enter test results.
        //user should define if he wants to enter another test result
        //ex: Enter test result..
        // 100
        //Do you want to enter another test result?
        //yes
        //Enter test result...
        //100
        // //Do you want to enter another test result?
        //no
        //your test average is....
        Scanner sc = new Scanner(System.in);
        String answer = "yes"; //boolean answer = true;
        int total = 0;
        int numOfTests = 0;
        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter test result...");
            int testScore = sc.nextInt();
            total+=testScore;
            numOfTests++;
            //Update statement
            System.out.println("Do you want to enter another test result?");
            answer = sc.next(); //changing the value of answer
        }
        System.out.println(total/numOfTests);
    }
}
