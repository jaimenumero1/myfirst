package MyMentoring;

public class MakeCup {

    public String color;
    public String material;
    public int capacity;


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
