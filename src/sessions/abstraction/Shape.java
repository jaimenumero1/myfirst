package sessions.abstraction;

//everything that is allowed in regular classes
//we are allowed to do in abstract classes
//+ on top of it we can have abtract methods
public abstract class                  Shape {
    private int area;
    public Shape(int area){
        this.area = area;
    }
    public int getArea() {
        return area;
    }
}
