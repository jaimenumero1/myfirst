package Sprint;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Tax_Estimator {
    public static void main(String[] args) {

//        As a tax estimator program user I would like to be able to input
//        my annual salary so that I receive an accurate estimation of my tax to be withheld.
//
//        Notes:
//        IRS has different brackets based on marital status. Use the brackets in the attached files.
//
//                Acceptance Criteria:
//
//        1. User should be asked to input annual salary
//
//        2. User should be asked to input marital status
//
//        2.1 -> if user is married
//
//        a. user should be asked to input filling jointly or separately.
//
//        b. proceed to calculating the tax
//
//        2.2 -> if user is single
//
//        a. proceed to calculating the tax
        try {
            NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
            Scanner sc = new Scanner(System.in);
            System.out.println("This is Uncle Sam's \"IRS\"  \\Calculator");
            System.out.println();
            System.out.println("Please Enter Your Salary $ ");

            double tenP = .1;
            double twelveP = .12;
            double twentyTwoP = .22;
            double twentyFourP = .24;
            double thirtyTwoP = .32;
            double thirtyFiveP = .35;
            double thirtySevenP = .37;

            double usersIncome = sc.nextDouble();
            while (usersIncome <= 0) {
                System.out.println("Please reEnter a Salary above zero:");
                usersIncome = sc.nextDouble();
            }
            System.out.println("Please Enter your Marital Status");
            System.out.println("Enter:\tSingle\t\\ Married\t\\ Separated");
            String maritalStatu = sc.next();
            sc.nextLine();
            String maritalStatus = maritalStatu.toLowerCase();

            while ((!(maritalStatus).equals("single")) && (!(maritalStatus).equals("separated")) && (!(maritalStatus).equals("married"))) {
                System.out.println("Please Enter your Marital Status");
                maritalStatu = sc.next();
                maritalStatus = maritalStatu.toLowerCase();
                // sc.nextLine();
            }


            System.out.println(maritalStatus);

            if ((maritalStatus).equals("single")) {

                if (usersIncome <= 9700) {
                    System.out.println("Your tax rate is 10%");
                    System.out.println("And the tax you owe us is: ");
                    System.out.printf(" Grand Total: $" + nf.format(usersIncome * tenP));
                } else if (usersIncome > 9700 && usersIncome <= 39475) {
                    System.out.println("Your tax rate is 12%");
                    System.out.println("And the tax owe is: ");
                    System.out.println(" Grand Total: $" + nf.format(usersIncome * twelveP));
                } else if (usersIncome > 39475 && usersIncome <= 84_200) {
                    System.out.println("Your tax rate is 22%");
                    System.out.println("And the tax you owe is: ");
                    System.out.println(nf.format(usersIncome * twentyTwoP));
                } else if (usersIncome > 84200 && usersIncome <= 160725) {
                    System.out.println("Your tax rate is 24%");
                    System.out.println("And the tax you owe is: ");
                    System.out.println("Grand Total of $" + nf.format(usersIncome * twentyFourP));
                } else if (usersIncome > 160725 && usersIncome <= 204100) {
                    System.out.println("Your tax rate is 32%");
                    System.out.println("And total you owe is $" + nf.format(usersIncome * thirtyTwoP));
                } else if (usersIncome > 204100 && usersIncome <= 510300) {
                    System.out.println("Your tax rate is 35%");
                    System.out.println("And tax you owe is: $" + nf.format(usersIncome * thirtyFiveP));
                } else {
                    System.out.println("Your tax rate is 37%");
                    System.out.println("Your tax owed will be $" + nf.format(usersIncome * thirtySevenP));
                }
            } else if ((maritalStatus).equals("separated")) {
                if (usersIncome <= 9700) {
                    System.out.println("Your tax rate is 10%");
                    System.out.println("And the tax you owe us is: ");
                    System.out.printf(" Grand Total: $" + nf.format(usersIncome * tenP));
                } else if (usersIncome > 9700 && usersIncome <= 39475) {
                    System.out.println("Your tax rate is 12%");
                    System.out.println("And the tax owe is: ");
                    System.out.println(" Grand Total: $" + nf.format(usersIncome * twelveP));
                } else if (usersIncome > 39475 && usersIncome <= 84_200) {
                    System.out.println("Your tax rate is 22%");
                    System.out.println("And the tax you owe is: ");
                    System.out.println(nf.format(usersIncome * twentyTwoP));
                } else if (usersIncome > 84200 && usersIncome <= 160725) {
                    System.out.println("Your tax rate is 24%");
                    System.out.println("And the tax you owe is: ");
                    System.out.println("Grand Total of $" + nf.format(usersIncome * twentyFourP));
                } else if (usersIncome > 160725 && usersIncome <= 204100) {
                    System.out.println("Your tax rate is 32%");
                    System.out.println("And total you owe is $" + nf.format(usersIncome * thirtyTwoP));
                } else if (usersIncome > 204100 && usersIncome <= 306750) {
                    System.out.println("Your tax rate is 35%");
                    System.out.println("And tax you owe is: " + nf.format(usersIncome * thirtyFiveP));
                } else {
                    System.out.println("Your tax rate is 37%");
                    System.out.println("Your tax owed will be $" + nf.format(usersIncome * thirtySevenP));
                }
            } else {
                if (usersIncome <= 19400) {
                    System.out.println("Your tax rate is 10%");
                    System.out.println("And the tax you owe us is: ");
                    System.out.printf(" Grand Total: $" + nf.format(usersIncome * tenP));
                } else if (usersIncome > 19400 && usersIncome <= 78950) {
                    System.out.println("Your tax rate is 12%");
                    System.out.println("And the tax owe is: ");
                    System.out.println(" Grand Total: $" + nf.format(usersIncome * twelveP));
                } else if (usersIncome > 78950 && usersIncome <= 168400) {
                    System.out.println("Your tax rate is 22%");
                    System.out.println("And the tax you owe is: ");
                    System.out.println(nf.format(usersIncome * twentyTwoP));
                } else if (usersIncome > 168400 && usersIncome <= 321450) {
                    System.out.println("Your tax rate is 24%");
                    System.out.println("And the tax you owe is: ");
                    System.out.println("Grand Total of $" + nf.format(usersIncome * twentyFourP));
                } else if (usersIncome > 321450 && usersIncome <= 408200) {
                    System.out.println("Your tax rate is 32%");
                    System.out.println("And total you owe is $" + nf.format(usersIncome * thirtyTwoP));
                } else if (usersIncome > 408200 && usersIncome <= 612350) {
                    System.out.println("Your tax rate is 35%");
                    System.out.println("And tax you owe is: $" + nf.format(usersIncome * thirtyFiveP));
                } else {
                    System.out.println("Your tax rate is 37%");
                    System.out.println("Your tax owed will be $" + nf.format(usersIncome * thirtySevenP));
                }
            }
        } catch (Exception e){
            System.err.println("Invalid input Program will end ");
            System.err.println("Please Rerun Program and Input only valid Entry's");
            }
            }





    }

