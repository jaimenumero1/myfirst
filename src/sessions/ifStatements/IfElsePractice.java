package sessions.ifStatements;

import java.util.Scanner;

public class IfElsePractice {
// Print out List Cars and car price
    // ask the user to enter car type. ex SUV
    // List all SUVs in the shop
    // user can make a selection of certain suv by entering either the number or the
    // model
    //print out price of the car

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter your car type");
        String carType = input.nextLine(); // next only takes the first word , only a single word
        //.nextline takes more than 1 word


        if (carType.equalsIgnoreCase("SUV")) {   // we can skip the curlybraces if there is only 1 statement
            // in the block
            System.out.println("Choose one of the folowing Cars in shop");
            System.out.println("1. Suburban \n2. MB G-Class \n3. Range Rover Vogue");
            String carModel = input.nextLine();

            if (carModel.equalsIgnoreCase("Suburban") || carModel.equalsIgnoreCase("1"))
            { System.out.println("Suburban Price: 20k");
            System.out.println("Year: 2020");}
            else if (carModel.equalsIgnoreCase("MB G-Class") || carModel.equalsIgnoreCase("2.")){
                System.out.println("MB G-Class: 80k");
                System.out.println("Year 2020");
            }

        }
        else if(carType.equalsIgnoreCase("Sports Car")){
            System.out.println("1. Porche 911 \n 2. Nissan GTR \n 3. Toyota Supra");
        }
        else if (carType.equalsIgnoreCase("Luxury")) {
            System.out.println("1. Rolls Royce \n 2. MB - S class \n 3. BMW 7 Series");

        }
        else if(carType.equalsIgnoreCase("Economy")) {
            System.out.println("1.Toyota Camry \n2.Mazda 6 \n3. Nissan Altima");
        }
        else{
            System.out.println("We dont have " + carType + " in our dealership");
        }







    }
}
