package homeworks;

import java.util.Scanner;

public class ComparisonIfCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        if ( firstNum > secondNum){
            System.out.println("\"The Second Number is smaller\"");
        } else if (secondNum > firstNum){
            System.out.println("\"The First Number is smaller\"");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
