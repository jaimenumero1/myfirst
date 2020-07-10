package MyMentoring;

public class cupStore {

    public static void main(String[] args) {

        SorinTeaCup cup = new SorinTeaCup();

        cup.capacity = "ml";
        cup.material = "Porcelain";
        cup.weight = 50;
        System.out.println(cup);

        SorinTeaCup cup2 = new SorinTeaCup("porcelain","ml",33);
        System.out.println(cup2);
    }
}
