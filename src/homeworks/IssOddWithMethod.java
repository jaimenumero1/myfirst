package homeworks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IssOddWithMethod {
    public static void main(String[] args) {
    IssOddWithMethod callIsOddM = new IssOddWithMethod();

        Scanner input = new Scanner(System.in);

        int loop1 = 3;

        while (loop1 > 0) {
            System.out.println("Please Enter a number: ");
            int inputedNumber = input.nextInt();
            boolean isOdd = callIsOddM.issOddMethod(inputedNumber);

            String result = (isOdd) ? " is an odd number" : " is an even number";
            System.out.println(inputedNumber + result);
            System.out.println();
            loop1--;
        }
    }
        public boolean issOddMethod (int num1){
        int temp = 0;
        if (num1 > 0)
        {return num1 % 2 == 1;}
        else {return (num1 * num1) % 2 == 1 ;}

        }
}
