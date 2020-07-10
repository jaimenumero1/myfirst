package sessions.dummy_folder;

import java.util.Scanner;

public class dummy2 {
    public static void main(String[] args) {


        //Will have a list animals.
        //User will input some animal -- DOG CAT -- Tiger and Bear
        //Program will tell me if it's a domestic animal
        //or wild animal

        Scanner input = new Scanner(System.in);
        System.out.println("Enter animal");

        String animal = input.next();

        if (animal.equalsIgnoreCase("DOG") || animal.equalsIgnoreCase("cat") || animal.equalsIgnoreCase("parrot") || animal.equalsIgnoreCase("snake") || animal.equalsIgnoreCase("chicken")) {
            System.out.println("domestic animal");
        } else if (animal.equalsIgnoreCase("tiger") || animal.equalsIgnoreCase("bear") || animal.equalsIgnoreCase("leopard")) {
            System.out.println("Wild Animal");
        } else {
            System.out.println("unknown animal");
        }

        int i = 0;
        double a = 123.42345;
        final String chickenVariable = "chicken";
        final String hippo = "Hippopotamus"; //When we want to simplify the value by short variableName;

        //variable
        switch (animal.toLowerCase()) { //converting the whole String var to lowerCases. if input Was DoG - at this line it's -> dog

            case "dog": //if(animal.equals(DOG)) --> case sensitive   ==>Dog, dOg, doG, DOg, DoG;
                System.out.println("domestic animal");
                break;
            case chickenVariable: //We can use this variable only bc it's final

                //case "dog": //duplicate case
                // case 1: data type mismatch =>> animal is string case is 1 int
            case "cat":
                System.out.println("domestic animal");
                break;
            case "tiger":
                System.out.println("wild animal");
                break;
            case "bear":
                System.out.println("wild animal");
                break;
            case hippo:
                System.out.println("wild animal");
                break;
            default:
                System.out.println("unknown animal");
                break;
        }


        // rewrite the above example to simplify
        switch (animal.toLowerCase()) {   //if statement or another switch statement in case
            case "dog":
            case "cat":
            case "chicken":
            case "snake":
                System.out.println("domestic animal");
                break;
            case "tiger":
            case "bear":
            case "leopard":
            case "Cobra":
            case hippo:
                System.out.println("wild animal");
                break;
            default:
                System.out.println("unknown animal");
                break;
        }

        String favAnimal = "Tiger";
        System.out.println("Fav animal: " + favAnimal.toUpperCase());
        System.out.println("Fav animal LowerCase: " + favAnimal.toLowerCase());


        //isEligbleToWork?
        int age = 19;
        String workPermitStatus = "Not Eligible";
        if (age > 18 && workPermitStatus.equalsIgnoreCase("eligible")) { //cannot have a analogy of this logic in switch. only one variable per switch
            System.out.println("Able to Work");
        }
    }
}
