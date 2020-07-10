package homeworks;

import java.util.Scanner;

public class CalculateStudenGradePro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input Student's Grade :");
        int homeworkScore = input.nextInt();

        if (homeworkScore >= 80){
            System.out.println("Grade 'A' ");

        }else if (homeworkScore < 80 && homeworkScore <= 60 ){
            System.out.println("Grade 'B' ");

        }else if (homeworkScore < 60 && homeworkScore >= 40) {
            System.out.println("Grade 'C' ");
        }else{
            System.out.println("Grade 'D'  ");
        }

    }
}
