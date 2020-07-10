package homeworks;

import java.util.Scanner;

public class Greatest_Number {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System. out.println("Please enter First Number: ");
        
        int num1 = input.nextInt();
        
        System.out.println(" Please Enter Second Number: ");
        
        int number2 = input.nextInt();
        
        int number3Max = Math.max(num1,number2);

        System.out.println("The greatest: " + number3Max);


        
    }
}
