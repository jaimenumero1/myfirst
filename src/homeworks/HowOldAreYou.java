package homeworks;

import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Plese Enter your Age:");

        int age = input.nextInt();

        if ( age < 16) {
            System.out.println("\"You cant drive.\"");
        }else if (age >= 16 && age <= 17) {
            System.out.println("\"You can drive but not vote\"");
        }else if (age >= 18 && age <= 24){
            System.out.println("\"You can vote but not rent a car.");
        }else if (age >= 25 && age <= 130){
            System.out.println("\"You can do pretty much anything");
        }else{
            System.err.println("You are not human!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

    }
}
