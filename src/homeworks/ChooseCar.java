package homeworks;

import java.util.Scanner;

public class ChooseCar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Plese Choose on of the following ");
        System.out.println(" 1. SUV");
        System.out.println(" 2. Sports Cars");
        System.out.println(" 3. Economy ");
        System.out.println(" 4. Luxury");

        String classWord = input.nextLine();
        String model = "";


        if (classWord.equals("1") || classWord.equalsIgnoreCase("SUV")) {
            System.out.println("1.Ford Explore");
            System.out.println("2.Honda CR-V");
            System.out.println("3.Toyota RAV4");
            System.out.println("4.Chevrolet Tahoe");
            System.out.println("Choose Model: ");
            model = input.nextLine();
            if (model.equalsIgnoreCase("Ford Explorer") || model.equalsIgnoreCase("1")) {
                System.out.flush();
                System.err.println("Ford Explorer The price is $$ 25_000");
                System.err.flush();
            } else if (model.equalsIgnoreCase("Honda CR-V") || model.equalsIgnoreCase("2")) {
                System.out.println("Honda CR-V The price is $$ 25_000");
            } else if (model.equalsIgnoreCase("Toyota RAV4") || model.equalsIgnoreCase("3")) {
                System.out.println("Toyota RAV4 The price is $$ 28_000");
            } else if (model.equalsIgnoreCase("Chevrolet Tahoe") || model.equalsIgnoreCase("4")) {
                System.out.println("Chevrolet Tahoe The price is 49k");
            } else {
                System.out.println("Wrong Entry ");
            }
            model = input.nextLine();
        } else if (classWord.equals("2") | classWord.equalsIgnoreCase("Sports Cars")) {
            System.out.println("Plese Choose on of the following ");
            System.out.println("1.Ford Mustang \n2.Chevy Corvette \n3.Lamborghini Huracan");
            System.out.println("4.Porsche 911 ");
        } else if (classWord.equals("3") | classWord.equalsIgnoreCase("Economy")) {
            System.out.println("1.Toyota Corolla \n2.Chevy Aveo \n3.Nissan Versa");
            System.out.println("4.Honda Civic");
        } else if (classWord.equals("4") | classWord.equalsIgnoreCase("Luxury")) {
            System.out.println("1.Bently Continental \n2.Maserati Quattroporte \n3.Mercedes-Benz");
            System.out.println("4.Lexus Ls");
        } else {
            System.err.println("Invalid Entry No Such Car Type");
        }
    }

        }




