package homeworks;

public class MethodDesign {

    public static void main(String[] args) {

        MethodDesign practiceMethod = new MethodDesign();

        practiceMethod.calculateAreaAndPerimeterOffARectangle(5.6, 8.5);
        practiceMethod.calculateAreaAndPerimeterOffARectangle(7.5, 8.8);
        practiceMethod.calculateAreaAndPerimeterOffARectangle(8, 9);


    }

    public void calculateAreaAndPerimeterOffARectangle(double width, double height) {
        double areaofRectangle = width * height;
        double perimeterOfRectangle = (width + height) * 2;
        System.out.println("Area of Rectangle is: " + areaofRectangle);
        System.out.println("Perimeter of Rectangle is: " + perimeterOfRectangle);

    }
}
