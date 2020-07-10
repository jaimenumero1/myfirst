package MyMentoring;

import java.util.Scanner;

public class SorinTeaCup {

String material;
String capacity;
int weight ;

public SorinTeaCup(){}
public SorinTeaCup(String material,String capacity,int weight){
    this.material = material;
    this.weight = weight;
    this.capacity = capacity;
}




    @Override
    public String toString() {
        return "SorinTeaCup{" +
                "material='" + material + '\'' +
                ", capacity='" + capacity + '\'' +
                ", weight=" + weight +
                '}';
    }
}
