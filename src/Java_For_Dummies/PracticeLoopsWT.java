package Java_For_Dummies;

import java.util.Random;
import java.util.Scanner;

public class PracticeLoopsWT {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number From 1 - 10");
        int guess = input.nextInt();


        int randomNumber = new Random() .nextInt(10)+ 1;

        for (;guess != randomNumber;){

                System.out.println("You loose 😭, Please try again :");
                int guess2 = input.nextInt();
            Thread.sleep(1999);
              guess = guess2;


        }

        System.out.println("Your the Lucky winner 🤣");


    }



}
