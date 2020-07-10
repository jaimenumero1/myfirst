package sessions.dummy_folder;

import java.util.Random;
import java.util.Scanner;

public class Super {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter Mira's Lucky number :");


        System.out.println("Miras Lucky number is: Lets tell the whole world ");

        System.out.println("Enter a number: ");
        int randomNumber2 = new Random ().nextInt(10)+1;
        int miraLuckyNumber = input.nextInt();

        while ( randomNumber2 != miraLuckyNumber){
            System.err.println("You loose");
            System.out.println("Please try again ");
            int newInput = input.nextInt();
            miraLuckyNumber = newInput;
        }
        System.out.println("Congratulations You win!!!!!!!!!!!");



    }
}
