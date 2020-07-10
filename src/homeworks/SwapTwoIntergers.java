package homeworks;

import java.util.Scanner;

public class SwapTwoIntergers {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first integer:");
    int first = input.nextInt();
    System.out.println("Enter second integer:");
    int second = input.nextInt();

    int temp = second;    

    second = first;
    first = temp;

    System.out.println("After the swap, first is:" + first + ", second is: " + second);

}

}
