package sessions.classes_objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UserAnimalRequestService2 {
    public static void main(String[] args) {
        System.out.println("Employee APP");
        Scanner sc = new Scanner(System.in);
        Animal1 dog1 = new Animal1("Dog", "Labrador", 2, 0,'M', 12,false);
        Animal1 dog2 = new Animal1("Dog", "Labrador", 3, 0,'F', 8,true);
       // Animal dog3 = new Animal("Dog", "Labrador", 1, 'M',false);
        Animal1 dog4 = new Animal1("Dog", "Pitbull", 1, 0,'F', 11,false);
        Animal1 dog5 = new Animal1("Dog", "Pitbull", 2, 0,'F', 13,true);
        Animal1 dog6 = new Animal1("Dog", "Pitbull", 4, 0,'M', 9,false);
        Animal1 cat1 = new Animal1("Cat", "Garfield", 1, 0,'F', 7,true);
        Animal1 cat2 = new Animal1("Cat", "Garfield", 1, 0,'M', 12,false);
        //Animal cat3 = new Animal("Cat", "Garfield", 2,'M', false);
        Animal1 cat4 = new Animal1("Cat", "Bengal", 1, 0,'M', 12,true);
        Animal1 cat5 = new Animal1("Cat", "Bengal", 4, 0,'M', 12,false);


        //create this collection here so that it's accessible to user search.
        List<Animal1> stock = new ArrayList<>();
        stock.add(dog1);
        stock.add(dog2);
        stock.add(dog4);
        stock.add(dog5);
        stock.add(dog6);
        stock.add(cat1);
        stock.add(cat2);
        stock.add(cat4);
        stock.add(cat5);




        //2. Ask Client to input what they are looking for
        System.out.println("/////////////////////");
        System.out.println("User App");
        System.out.println("/////////////////////");
        //a. Animal Type
        System.out.println("Enter animal type");
        String type = sc.nextLine();
        //b. breed
        System.out.println("Enter " + type + " breed");
        String breed = sc.nextLine();
        //c. gender
        System.out.println("Enter gender");
        char gender = sc.nextLine().charAt(0);
        //Print out all animals info that match the request
        for (Animal1 animal : stock) {
            if (animal.type.equalsIgnoreCase(type) && animal.breed.equalsIgnoreCase(breed) && animal.gender == gender){
                System.out.println(animal);//hashCode -> we dont have toString method in Animal class


            }
        }



    }
}
