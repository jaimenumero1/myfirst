package sessions.classes_objects;
//1. class can be used to create a structure for maintaining information.
//2. class can be used to accomplish some tasks.
import java.util.Scanner;
/**
 * this class is responsible for creating animals
 * and adding to the stock.
 */
public class hiuhkjn {
    //method
    //get info for the animal and create and animal object and return that animal
    public Animal1 createAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Animal type");
        String type = sc.nextLine();
        //enter dog breed
        System.out.println("Enter " + type + " breed");
        String breed = sc.nextLine();
        //age
        System.out.println("Enter age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter duration");
        int duration = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter gender(F/M)");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Enter weight");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.println("Is animal injured(true/false)");
        boolean isInjured = sc.nextBoolean();
        Animal1 animalFromEmployee = new Animal1(type, breed, age, duration, gender, weight, isInjured);
        return animalFromEmployee;
    }
}
