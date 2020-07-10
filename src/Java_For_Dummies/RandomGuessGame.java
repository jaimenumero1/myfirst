package Java_For_Dummies;

import java.util.Scanner;

public class RandomGuessGame {

    public static void main(String[] args) {
        /**Write a program that generates a random number and asks the user to guess 
         *  what the number is.           *If the user's guess is higher than the random number,
         *            the program should display "Too high, try again."  
         *  *If the user's guess is lower than the random number, 
         *  the program should display "Too low, try again."  
         *  The program should use a loop that repeats until the 
         *  user correctly guesses the random number.          **/
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Guess our Number");
        int guessNum ;
        int tries = 0;


            System.out.println("enter a guess between 1 and 100: ");
            guessNum = input.nextInt();
            tries++;


    }
}
