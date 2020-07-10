package homeworks;

        import java.util.Scanner;

public class Assignment4A {
    public static void main(String[] args) {

        System.out.println("Please Enter radius: ");
        Scanner input = new Scanner(System.in);

        double perimeter, area, radius ;

        radius = input.nextDouble();
        perimeter = 2*(radius * 3.1415926535897932384626);
        System.out.println("Your Perimeter is = " + perimeter);

        area =3.1415926535897932384626*radius*radius;
        System.out.println();
        System.out.println("Your Area is = " + area);


    }
}