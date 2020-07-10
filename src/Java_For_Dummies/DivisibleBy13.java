package Java_For_Dummies;

public class DivisibleBy13 {
    //Write a program which will find me first number evenly divisible by 13.
    //number is between 0 and 100
    public static void main(String[] args) {

        for (int a = 1; a < 100; a++) {
            if (a % 13 == 0) {
                System.out.println("The first number divisible from 13 is: " + a);
                break;
            }

        }

    }
}
