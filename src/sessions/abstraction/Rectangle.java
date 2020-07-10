package sessions.abstraction;

public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(int length, int width){
        super(length * width);
        this.length = length;
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
}
