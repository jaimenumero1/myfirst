package homeworks;

import java.util.Scanner;

public class Calculat_basedOnRev {
    //    As a user I'd want to have the discount rate as 10% for the quantity purchased between 100 and 120 units,
//    And 15% for the quantity purchased greater than 120 units.
//    And If the quantity purchased is less than 100 units, then discount rate is 0%.
//
//    See the example output as shown below:
//    Enter unit price: 25
//    Enter quantity: 110
//    The revenue from sale: 2475.0$
//    After discount: 275.0$(10.0%)
    public static void main(String[] args) {
        double revenue = 0;
        double discount = 0;

        System.out.println("Please Enter unit Price: ");
        Scanner input = new Scanner(System.in);
        int unitsPrice = input.nextInt();
        if (unitsPrice < 0) {
            System.out.println("Please Enter a number of unitsPrice above 0: ");
            unitsPrice = input.nextInt();
        }
        System.out.println("Please Enter quantity: ");
        int quantity = input.nextInt();
        if (quantity < 100) {
            revenue = quantity * unitsPrice;
            System.out.println("The revenue from the sale is: " + revenue);
            System.out.println("Sorry no discount for Purchases under 100 units ");

        }
    }
}
