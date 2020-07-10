package homeworks;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeMorePractice {

    public static void main(String[] args) {

        List<String> artists = new ArrayList<>();
        artists.add("Shakira");
        artists.add("Beyonce");
        artists.add("Jason Statham");
        artists.add("Mario Almada");
        System.out.println(artists);

        System.out.println();
        artists.set(2, "Mike Tyson");
        System.out.println(artists);
        System.out.println();
        artists.set(0,"");
        System.out.println(artists);
        System.out.println();

        artists.remove("");   // remove empty space or just array list "," comma
        System.out.println(artists);

        System.out.println();
        List<String> colors = new ArrayList<>();

        System.out.println("is Arraylist empty " + colors.isEmpty());

        colors.add("blue");
        colors.add("yellow");
        colors.add("Red");
        colors.add("purple");
        System.out.println();
        System.out.println(colors);
        System.out.println();
        System.out.println("is this array empty ---> "+ colors.isEmpty());

        System.out.println();
        System.out.println("Size of this array is; " + colors.size());
        System.out.println();

        System.out.println(colors.get(0)); // same as array[0];
        System.out.println(colors.get(1)); // same as array[1];
        System.out.println();

        colors.add("pink");
        colors.add("black");

        System.out.println("Loop through the List to print it out --->");
        for(int i = 0 ; i < colors.size(); i++){

            System.out.println(" " + colors.get(i) + " ");
          //  System.out.print();
        }
        System.out.println();
        System.out.print("");
        for (int k = 0; k < colors.size(); k++) {
            if (colors.get(k).startsWith("p")){
                System.out.print(colors.get(k)+ " " );}
        }

        System.out.println();
        System.out.println();
        ArrayList<String> companies = new ArrayList<>();
        companies.add("Google");
        companies.add("Facebook");
        companies.add("Twitter");
        companies.add("Amazon");


        System.out.println(companies + "size " + companies.size());
        companies.clear();
        System.out.println();
        System.out.println(companies);

        ArrayList<String> cards = new ArrayList<>();
        cards.add("Heart");
        cards.add("Piki");
        cards.add("Bubi");
        cards.add("dimond");

        System.out.println(cards.contains("Piki"));
        System.out.println();
        System.out.println(cards.contains("piki"));

        ArrayList<StringBuilder> movies = new ArrayList<>();
        StringBuilder sweetN = new StringBuilder("Sweet November");

        movies.add(sweetN);
        movies.add(new StringBuilder("Joker"));
        movies.add(new StringBuilder("Legend"));

        System.out.println("movies");

        System.out.println(" Contains Method Result:\t ----> " + movies.contains(sweetN));

        ArrayList<String> cards1 = new ArrayList<>();
        cards1.add("Heart");
        cards1.add("Piki");
        cards1.add("Bubi");
        cards1.add("dimond");
        //cards1.add("Club");
        System.out.println("Testing .equals method for List\t---> " + cards1.equals(cards));

        ArrayList<StringBuilder> movies1 = new ArrayList<>();
        //StringBuilder sweetN = new StringBuilder("Sweet November");

        movies1.add(sweetN);
        movies1.add(new StringBuilder("Joker"));
        movies1.add(new StringBuilder("Legend"));
        System.out.println("Comparing Now same arrays (copy pasted) but objects " + movies.equals(movies1));
    }
}
