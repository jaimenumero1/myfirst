package homeworks;

import java.util.Scanner;

public class Assignment4B {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = a % 10;
        int c = a / 10;

        System.out.println("The sum of the digits is: " + (b+c));
    }
}
