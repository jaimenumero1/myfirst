package homeworks;

import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println(" Enter Phone keypad letter ");

        String phonneCharacter = input.next();
      phonneCharacter = phonneCharacter.toUpperCase();

        String outputNumber = "";
        switch (phonneCharacter) {
            case "A":
            case "B":
            case "C":
                outputNumber = "2";
                break;
            case "D":
            case "E":
            case "F":
                outputNumber = "3";
                break;
            case "G":
            case "H":
            case "I":
                outputNumber = "4";
                break;
            case "J":
            case "K":
            case "L":
                outputNumber = "5";
                break;
            case "M":
            case "N":
            case "O":
                outputNumber = "6";
                break;
            case "P":
            case "Q":
            case "R":
            case "S":
                outputNumber = "7";
                break;
            case "T":
            case "U":
            case "V":
                outputNumber = "8";
                break;
            case "W":
            case "X":
            case "Y":
            case "Z":
                outputNumber = "9";
            default:
                System.out.println("Incorect Input ");

        }
        System.out.println();
        System.out.println("The Charater converted to keypad number is: " + outputNumber);


    }


}


