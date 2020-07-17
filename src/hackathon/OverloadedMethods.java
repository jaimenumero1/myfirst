package hackathon;

public class OverloadedMethods {

    public static void main(String[] args) {


        // Poly Morphism
        // many forms or //  many behaviors

        OverloadedMethods a = new OverloadedMethods();
        a.addNums(9.0,9.7,1.0);
    }


    public void addNums(int i , int b){
        System.out.println(i+b);
    }
    public void addNums(double e , double t, double j){
        System.out.println(e+t+j);
    }
}
