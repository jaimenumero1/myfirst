package sessions.abstraction.abstract_extend_abstract;

public class Navel_Orange extends Clone {


    public static void main(String[] args) {
        Navel_Orange orange = new Navel_Orange();
        double num = orange.calculateSugarPerOunce();
        System.out.println(num);
    }


    public double calculateSugarPerOunce(){
        return 9.0;
    }
}
