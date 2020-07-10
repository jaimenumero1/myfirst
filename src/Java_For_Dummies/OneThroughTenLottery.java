package Java_For_Dummies;
import static java .lang.System.out;
import static java.lang.System.setOut;

import java.util.Random;
import java.util.Scanner;

public class OneThroughTenLottery {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        out.print("Enter an int from 1 to 10:  ");

        int inputNumber = keyboard.nextInt();

        int randomNumber = new Random() .nextInt(10)+ 1;
        if (inputNumber == randomNumber){
            out.println("***************");
            out.println("*** You Win ***");
            out.println("***************");
        } else {

            out.println(" You lose. :<( :<( ");
            out.print("The random number was ");
            out.println(randomNumber + ".");
            }
        out.println("Thank you for playing.");
        out.println();

        out.println("Try Again ");
        int inputNumber2 = keyboard.nextInt();
        if (inputNumber2 == randomNumber){
            out.println("***************");
            out.println("*** You Win ***");
            out.println("***************");
        } else {

            out.println(" You lose.  :<( :<( ");
            out.print("The random number was ");
            out.println(randomNumber + ".");
        }
        out.println("Thank you for playing.");
        out.println();

        keyboard.close();



    }
}
