package Mentor_homeworks;

import java.util.Scanner;

public class IfExplanation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("2 + 2 = ?  ");

        int num1 = input.nextInt();

        if (num1 == 4){
            System.out.println("Correct ");
        }
        else {
            System.out.println("Wrong ");

        }

    }


}
