package sessions.interface1;

public class Circle implements Shape {
private String color;
    private double radius;
    private String name;


    public Circle(double radius, String name,String color){
        this.radius = radius;
        this.name = name;
        this.color = color;
    }


    public double calculateArea(){
        return radius * radius *3.14;
    }
    public void printShapeName(){
        System.out.println(name);
    }
    public void setColor(String color){
        this.color = color;
    }
}
