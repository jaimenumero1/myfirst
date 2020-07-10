package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Width");
        double width = input.nextDouble();

        System.out.println("Please Enter Length");
        double legth = input.nextDouble();

        double area = width*legth;
        double perimeter =2* (width+legth);


        DecimalFormat formatter = new DecimalFormat(".00");

        System.out.println("Area is "+ formatter.format(width) + " * " + formatter.format(legth) +" = " + formatter.format(area));

        System.out.println("Perimeter: " + formatter.format(perimeter));


    }
}
