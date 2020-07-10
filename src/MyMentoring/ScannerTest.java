package MyMentoring;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

char[] newArr = new char[9];

       // Scanner input = new Scanner();
        StringBuilder s = new StringBuilder();

       MakeCup firstCup = new MakeCup();

        MakeCup tea = new MakeCup("white","Glass",12);
        firstCup.capacity = 20;
        firstCup.material = "Porcelain";
        firstCup.color = "black";
        System.out.println(tea);
        System.out.println();

        System.out.println(firstCup);

    }
}
