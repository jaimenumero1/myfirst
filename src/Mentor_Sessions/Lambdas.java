package Mentor_Sessions;
import com.github.javafaker.Faker;
import java.util.*;
/**
 *  forEach() - similar to for each loop (enhanced for loop) executes your code for each element in a list
 *  
 *  removeIf() - removes an elements that are matching the condition  from your list (return should be boolean)
 *  ex: x -> x.starsWith("A"); x -> x < 100 etc
 *  
 *  sort() - sorts your list based on a comparison provided, expects 2 elements (x, y) -> ; return type should be int
 *  ex: (x, y) -> x - y; (x, y) -> x.compareTo(y)
 */
public class Lambdas {
    public static void main(String[] args) {
        // Java Faker
        // Lamda - Implementation of a functional interface
        // Functional interface  has only one abstract method.
        // Java faker dependency
        Faker f = new Faker();
     //   Faker.instance().name().first();
        List<Customer> ls = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            ls.add(
                    new Customer(f.name().firstName(),
                            f.name().lastName(),
                            new Random().nextInt(80) + 1)
            );
        }
        System.out.println(ls);

        ls.sort((x, y) -> x.age - y.age);
        System.out.println(ls);
      //  customers.sort((x, y) -> x.age - y.age);
    }
    public static void  m3(Faker f){
        Map<String, String> mp = new HashMap<>();
        //Populate map
        for (int i = 0; i < 10; i++){
            mp.put(f.name().lastName(), f.name().firstName());
        }
        System.out.println(mp);
        List<String> ls = new ArrayList<>();
        // if (key in map starts with H add value to ls (List))
        mp.forEach((key, value) -> {
            if(key.startsWith("H")){
                ls.add(value);
            }
        });
        System.out.println(ls);
    }


    public static void m2( Faker f){
        List<String> ls = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            System.out.println(f.chuckNorris().fact());
            ls.add(f.name().firstName());
        }
        System.out.println(ls);
        ls.removeIf(x -> !x.startsWith("A"));
        System.out.println(ls);
    }
    public static void m1(List<String> ls){
        // 1) declare a variable
        // 2) ->
        // code you want to be called for each element
        ls.forEach(x -> {
            //System.out.println(x);
            if(x.startsWith("A")){
                System.out.println(x);
            };
        });
    }
}