package Mentor_Sessions;

import java.util.Scanner;

public class MarianaIfElse {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Yummy land\n" +
                " Select an option:\n" +
                " 1) Pizza;\n" +
                " 2) Burger;\n" +
                " 3) Salad");
        System.out.println("Your choice: ");
        int enteredNumber = input.nextInt();
        if (enteredNumber == 1) {
            System.out.println("User selected Pizza");
        }
        if (enteredNumber == 2) {
            System.out.println("User selected Burger");
        }
        if (enteredNumber == 3){
            System.out.println("User selected Salad");
        } else {
            System.out.println("No such item in the menu");

            int i = 1;
            int j = 1;
            int k = 1;
            int l = 1;
            System.out.println(i++ + i++); //1(2) + 2(3) = 3
            System.out.println(++j + ++j); //2 + 3 = 5
            System.out.println(k++ + ++k); //1(2) + 3 = 4
            System.out.println(++l + l++); //2 + 2(3) = 4


            int N1 = input.nextInt();
            int N2 = input.nextInt();
            int N3 = input.nextInt();
            if (N1 > N2 && N1 > N3) {
                System.out.println("Bigger output number" + N1);
            }
            if (N2 > N3 && N2 > N1){
                System.out.println("Bigger output number" + N2);
            }
            if(N3 > N1 && N3 > N2) {
                System.out.println("Bigger output number" + N3);
            }else{
                System.out.println("All numbers are equal!");


                                    //Practice 4

                //In blackjack after the player asks to keep the house 4 things may happen.
                // 1) if the card total is > 21 the player busts.
                // 2)if the house score is > the player, the player loses .
                // 3)if the player score is ==the house then it's a tie.
                // 4)if the player score is >the house the player wins.
                // Player and house scores are represented by
                // wo int variables: player and house
                // Hint: check them using Ifs to determine the result and Scanner for int variables.
                // Example: player = 21house = 8output: bus

                System.out.println("Please enter player cards");
                int playerCards = input.nextInt();
                System.out.println("Player Cards total" +playerCards);
                System.out.println("Please enter house cards");
                int houseCards = input.nextInt();
                System.out.println("House cards total" +houseCards);
                if (playerCards > 21){ //1)
                    System.out.println("The player Busts!");
                }
                if (houseCards > playerCards && houseCards <= 21 ) {
                    System.out.println("The player losses!");
                }
                if (houseCards==playerCards ){
                    System.out.println("Its a tie!");
                }
                if (playerCards > houseCards && playerCards<=21){
                    System.out.println("Player Wins");
                }





            }



        }

    }
}
