package sessions.operators;

public class AddMessageNextToNumbers {

    public static void main(String[] args){

        String carmake = "Ferrari";
        int carYear = 2020;
        int mileAge = 0;
        //+ sign with String appends means adds the value of next variable
        // to the end of the String
        System.out.println("Car Make: "+carmake);
        System.out.println("Car Year:"+carYear);
        System.out.println("Mileage: " + mileAge);
        System.out.println();
        double spoonPrice = 0.99;
        int amountOfSpoons = 4;
        double totalDue = amountOfSpoons * spoonPrice;


        double forkPrice =1.99;
        int amountOfForks =6;
        double totalDueForForks = amountOfForks * forkPrice;


        System.out.println("Total Price for " + amountOfSpoons + " Spoons: $" + "totalDue");
        System.out.println("Total Price for " + amountOfForks + " Forks: $" + totalDueForForks);

        //                          2) adds Total: 15.89              1) 15.89
        System.out.println("Total: " + (totalDue + totalDueForForks));

        System.out.println("My spending: $" + (50 + 100));

        System.out.println(6 + 10 + " parkings");
        System.out.println("Hello World " + 5 + 10);
        // When working with String + will just bring the values inside the quotes.

        //


    }
}
