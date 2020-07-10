package homeworks;

import java.util.Scanner;

public class AgeMessages {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you name:");
        String name = input.next();
        System.out.println("Plese Enter your Age:");

        int age = input.nextInt();

        if ( age < 16) {
            System.out.println("\"You cant drive.\"");}
         if (age == 16 || age == 17) {
            System.out.println("\"You can drive but not vote\"");
        } if (age >= 18 && age <= 24){
            System.out.println("\"You can vote but not rent a car.");
        } if (age >= 25 && age <= 130){
            System.out.println("\"You can do pretty much anything");
        }{ if(age >130)
            System.err.println("You are not human!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

    }
}



