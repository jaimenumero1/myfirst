package sessions.Loops;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        //there is a chance that while loop will not run at all
        boolean run = false;
        while (run){
            System.out.println("Run Forest Run");
        }
        boolean run1 = false; //variables once created can be reassigned to a
        //new value
        // you can change the value of of variable
        do {
            System.out.println("Run Forest Run[Do While]");//body
        }
        while (run1);
        //write a program to print out "SDET" 10
        int var = 1; //declared outside of the loop
        do {
            System.out.println("SDET " + var);
            var++;
        }while (var <= 10);// 2 <= 10 // 1 <= 10
        //print out "Study " infinite time
        int i = 10;
        //update expression's role is to get the variable in test expression closer to being false
        while (i > 0){
            System.out.println("Study");
            i--;
        }
        // only difference between while and do while that do while runs the body of loop at least once no matter what
        // atm => asks to enter password.
        // if the password is right it will log you in
        // if the password is incorrect
        // ask for pass again
        // do this 3 times
        //please enter your password
        //2323
        //please enter your password
        //3455
        //please enter your password
        //3435
        int expectedPassword = 1234;
        Scanner sc = new Scanner(System.in);
        int password = 34;
        do {
            System.out.println("please enter your password");
            password = sc.nextInt(); //update statement   ==> 2323
        }while (expectedPassword != password);
    }
}
