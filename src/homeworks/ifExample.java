package homeworks;

import java.util.Scanner;

public class ifExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Input first num:");
        int firstNum = input.nextInt();

        System.out.println("Input Second num:");
        int secondNum = input.nextInt();

        System.out.println("Input third num:");
        int thirdNum = input.nextInt();

        if ( firstNum + secondNum == thirdNum){
            System.out.println("The result is: true");
        }



    }

}
