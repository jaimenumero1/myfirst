package Mentor_Sessions;

import java.util.Scanner;

public class SofiaMentoring {

    public static void main(String[] args) {
        char one = 'a';
        int b = one; // 95  'A' = 65     'a' = 95
        boolean c = one > 100; // false

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a characer: ");
        char input = scan.next().charAt(0);
        int numberInt = input;
        System.out.println(numberInt);

    }
}
