package homeworks;

import java.util.Scanner;

public class ChangeToUpperLetter {

    public static void main(String[] args) {

        String firstName = "james";
        String lastName = "lopez";

        System.out.println("Please enter your first name ");
        Scanner input = new Scanner(System.in);

        firstName = input.nextLine();
        System.out.println("Please enter you last:");
        lastName = input.nextLine();

        String firstLetter = firstName.substring(0,1).toUpperCase();
        String restOfStr = firstName.substring(1);

        String lastNameFirstL = lastName.substring(0,1).toUpperCase();
        String lastNameRest = lastName.substring(1);

        System.out.println("Your first name capitalized is :\t" + firstLetter + restOfStr);
        System.out.println("Your Last name capitalized is :\t\t" + lastNameFirstL + lastNameRest);

    }


}
