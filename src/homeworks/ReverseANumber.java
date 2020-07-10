package homeworks;

import java.util.Scanner;

public class ReverseANumber {

   // Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
    //For example, if the input is 12345, the output should be 54321.
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);


       System.out.println("Please Enter a number you would like to be reversed: ");

       int num = input.nextInt();
       int newNum = 0;
       int temp = 0;
                        // 54321/10
                        // move 1 over to the left one space we multiply

       while( num != 0) {


           newNum = newNum * 10;

           newNum = newNum + num%10;
           num = num /10;

       }
       System.out.println(newNum);
   }

}
