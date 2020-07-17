package MyMentoring;

public class MakeCup  extends UtensilsParent{

    public String color;
    public String material;
    public int capacity;


    public void saySomething(){
        System.out.println("Gulp Gulp!!!");
    }

    MakeCup(String color, String material, int capacity) {
        this.color = color;
        this.material = material;
        this.capacity = capacity;
    }
    public MakeCup(){

    }



    @Override
    public String toString() {
        return "MakeCup{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
