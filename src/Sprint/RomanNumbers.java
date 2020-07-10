package Sprint;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        System.out.println(" Please Enter a Number that you would like to convert to Roman");
        Scanner input = new Scanner(System.in);
        String romanOutput = "";
        int userInputNum = 0;

            try {
                 userInputNum = input.nextInt();




                while (userInputNum == 0) {
                    System.err.flush();
                    System.err.print("The number zero does not have its own Roman numeral,");
                    System.err.flush();
                    System.out.println(" but the word nulla (the Latin word meaning ");
                    System.out.println("\"none\") was used by medieval scholars in lieu of 0.");
                    userInputNum = input.nextInt();
                }
                while (userInputNum < 0 || userInputNum == 0) {
                    System.err.println("Please Enter a positive number");
                    userInputNum = input.nextInt();
                }
                while (userInputNum > 3999) {
                    System.err.println("Please Enter a number less than 3999");
                    userInputNum = input.nextInt();
                }


                while (userInputNum >= 1000) {
                    romanOutput = romanOutput + "M";
                    userInputNum = userInputNum - 1000;
                }
                while (userInputNum >= 900) {
                    romanOutput = romanOutput + "CM";
                    userInputNum = userInputNum - 900;
                }
                while (userInputNum >= 500) {
                    romanOutput = romanOutput + "D";
                    userInputNum = userInputNum - 500;

                }
                while (userInputNum >= 400) {
                    romanOutput = romanOutput + "CD";
                    userInputNum = userInputNum - 400;
                }

                while (userInputNum >= 100) {
                    romanOutput = romanOutput + "C";
                    userInputNum = userInputNum - 100;
                }
                while (userInputNum >= 90) {
                    romanOutput = romanOutput + "XC";
                    userInputNum = userInputNum - 90;
                }
                while (userInputNum >= 50) {
                    romanOutput += "L";
                    userInputNum -= 50;
                }
                while (userInputNum >= 40) {
                    romanOutput += "XL";
                    userInputNum -= 40;
                }
                while (userInputNum >= 10) {
                    romanOutput += "X";
                    userInputNum -= 10;
                }
                while (userInputNum >= 9) {
                    romanOutput += "IX";
                    userInputNum -= 9;
                }
                while (userInputNum >= 5) {
                    romanOutput += "V";
                    userInputNum -= 5;
                }
                while (userInputNum >= 4) {
                    romanOutput += "IV";
                    userInputNum -= 4;
                }
                while (userInputNum >= 1) {
                    romanOutput += "I";
                    userInputNum -= 1;
                }
                System.out.println("The Roman number is :" + romanOutput);
                //   System.out.println("programm is good");
            } catch (Exception e) {

                System.err.println("Sorry this is not a number Please enter a number ");

                System.err.println("Please rerun the program and enter a valid Number");

            }
    }
}