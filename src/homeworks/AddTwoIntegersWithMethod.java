package homeworks;

import java.util.Scanner;

public class AddTwoIntegersWithMethod {

    public void addTwoNumbers (int a, int b){
        int sum1 = a+b;
        System.out.println("The sum is: " + sum1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int firstNum = input.nextInt();
        System.out.println("Enter second number");
        int secondNum = input.nextInt();

        AddTwoIntegersWithMethod sum1 = new AddTwoIntegersWithMethod();

        sum1.addTwoNumbers(firstNum,secondNum);
    }
}
