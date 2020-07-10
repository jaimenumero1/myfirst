package sessions.interface1;

public interface Shape {
    // public abstract -> are implicitly placed before methods

    double calculateArea();
    /**
     * calculate area of the Shape
     * @return area
     */


    /**
     * Print name of the shape
     */

    void printShapeName();

    /**
     * all shapes must have color
     * so the color should be able to be changed via this method
     * @param
     */

    public void setColor(String color);
}
