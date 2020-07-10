package homeworks;

import java.util.Scanner;

public class TakeThreeNumbersPrintGreatest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("input first num: ");
        int num1 = input.nextInt();
        System.out.println("input second:");
        int num2 = input.nextInt();
        System.out.println("input third:");
        int num3 = input.nextInt();

        int max = Math.max(Math.max(num2,num3),num1);
        System.out.println( "The Greatest is: " + max);

    }
}
