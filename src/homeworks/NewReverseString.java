package homeworks;

import java.util.Scanner;

public class NewReverseString {

//    Write a program called ReverseString, which prompts user for a String,
//    and prints the reverse of the String by extracting and processing each character.
//    The output shall look like:
//    Enter a String: abcdef
//    The reverse of the String "abcdef" is "fedcba".

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Word to be Reversed: ");
        String str = input.nextLine(); // abcdef
        int numOfLoops = 0;
        String unFixed = "";
        int stringlength = str.length()-1;

        while (numOfLoops <= stringlength){

            unFixed = unFixed + str.charAt(stringlength);
            stringlength--;

        }
        System.out.println(unFixed);



    }

}
