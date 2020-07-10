package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment_PerimeterOfRectangle {

    public static void main(String[] args){

        System.out.println("Please Enter Width: ");
        Scanner input = new Scanner(System.in);


        double width,height;
        width = input.nextDouble();
        System.out.println("please Enter Height: ");
        height = input.nextDouble();
        System.out.println();

        System.out.print("Area is 5.6 * 8.5 = ");

        System.out.println( new DecimalFormat("00.00"). format(width*height));
        System.out.println();

        System.out.print("Perimeter is ");

        System.out.println("2*(5.6 + 8.5)" + "= " + ((width+height)*2));
    }
}
