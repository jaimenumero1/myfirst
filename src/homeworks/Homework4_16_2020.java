package homeworks;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework4_16_2020 {

    public static void main(String[] args) {

        DecimalFormat formatter = new DecimalFormat(".00");
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        double cost = 0.00;

        if ( distance > 0 && distance <= 100) {
            cost = 5.00;
        }
        else if (distance > 100 && distance <= 500){
            cost = 8.00;
        }
        else if (distance > 500 && distance < 1000){
            cost = 10.00;
        }
        else if (distance > 1000){
            cost = 12.00;
        }
        else {
            System.out.println("No Negative numbers please ");

        }
        System.out.println(" Your Cost is $ " + formatter.format(cost));


    }
}
