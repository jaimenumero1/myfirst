package homeworks;

import javafx.scene.chart.ScatterChart;

import java.util.Scanner;

public class FibonachiNumbers {

    public static void main(String[] args) throws InterruptedException {
        //
        Scanner sc = new Scanner(System.in);
       try {
           System.out.println("Please Input a number location in the Fibonacci Sequence you would like to see ");
           int numberIn = sc.nextInt();


           while (numberIn < 0 || numberIn == 0) {
               System.out.println("Invalid Input: Please Enter a posivie number:");
               numberIn = sc.nextInt();
           }
           if(numberIn == 1){
               System.out.println("The fibonacci number is " + 1);
           }else {
           // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144  233, 377, 610, 987,

           int num = 0;
           int temp = 0;
           int i = 1;
           //System.out.print(num + " " + i + " ");
           for (int k = 0; k < numberIn - 1; k++) {
               Thread.sleep(1);
               num = num + i;
               temp = i;
               i = num;
               num = temp;

           } System.out.print("The fibonacci number is: " + i);
           }

       }catch (Exception e){
           System.err.println("Please Re-run Program, Input was not a valid number");
       }

    }
}
