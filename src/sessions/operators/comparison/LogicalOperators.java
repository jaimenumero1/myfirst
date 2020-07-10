package sessions.operators.comparison;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        //! - not--> negating.  --> take the opposite

        System.out.println(true);
        System.out.println(!true);
        System.out.println(false);
        System.out.println(!false);


        //isEquals() dont create notEquals()
        // cotains () dont create doesNotContain();

        // Give some discount to unmarried people;
        Scanner input = new Scanner(System.in);


        System.out.println("Are you married? ");
        boolean isMarried = input.nextBoolean();
        System.out.println("Should I give discount? " + !isMarried);


        //// Return true if x is between 0 and 100 (inclusive)
        int x = -2;
        boolean isValidNumber = x <= 100 && x >= 0;

        //true      false
        boolean isValidNuber = x <= 100 && x >= 0;


        System.out.println("is " + x + " between 0 and 100? " + isValidNumber);


        // int y = 55;
        //boolean isValidNumber = 0 <=y <= 100 ; // Compilation Error need compare int to in
        // cannot compare boolean to int

        int a = 10, b = 5, c = 1, result;

        result = a - ++c - ++b; // ==> 10 - 2 - 6

        System.out.println(result);


    }
}
