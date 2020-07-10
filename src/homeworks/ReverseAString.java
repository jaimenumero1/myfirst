package homeworks;

import java.util.Scanner;

public class ReverseAString {
//    Write a program called ReverseString, which prompts user for a String,
//    and prints the reverse of the String by extracting and processing each character.
//    The output shall look like:
//
//    Enter a String: abcdef
//    The reverse of the String "abcdef" is "fedcba".

    public static void main(String[] args) {
        String str,reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = input.nextLine();

        int loopCount = 0;
        int lengthOfString = str.length()-1;
                  //11           0
        while (lengthOfString >= loopCount){

            reverse = reverse + str.charAt(lengthOfString);
           --lengthOfString;
        }
        System.out.println(reverse);
    }

}
