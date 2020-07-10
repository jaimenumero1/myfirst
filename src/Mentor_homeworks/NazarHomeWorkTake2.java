package Mentor_homeworks;

import java.util.Scanner;

public class NazarHomeWorkTake2 {

    public static void main(String[] args){

        /*
        2. Given 4 digit number ex: 4568
        store each digit in a separate variable
        print int this format(Digit 1 : 4, digit 2 : 5, digit 3 : 6, digit 4 : 8 )
        Please post your solutions here before 5 pm tomorrow
        */

        Scanner input = new Scanner(System.in);

        int fourdigitnumber = input.nextInt();

        int a = fourdigitnumber /1000;
        int b = fourdigitnumber /100 %10;
        int c = fourdigitnumber / 10 % 10;
        int d = fourdigitnumber % 10;

        System.out.println("Digit 1 : " + a + " Digit 2 : " + b + " Digit 3 : "+ c + " Digit 4 :" + d );


        System.out.println();


    }
}
