package homeworks;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Samantha");
        names.add("Mike");
        names.add("James");
        names.add("Jose");

        System.out.println("The names in the List are: " + names);
        names.add(1, "Kasiet");
        System.out.println(names);                  // List allows you to print it out easy same as String no need
        // to do Arrays. to String method like in Array
        System.out.println("Please enter a name :   ");
        Scanner sc = new Scanner(System.in);
        String inputedName = sc.nextLine();

        names.add(inputedName);
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(77);
        System.out.println("please enter number: ");
        int num1 = sc.nextInt();
        numbers.add(num1);
        ArrayList<Boolean> isHappy = new ArrayList<>();

        ArrayList<Double> moneyChange = new ArrayList<Double>();
        names.remove("Jose");
        System.out.println("We removed in previous line of code the name : " + names.remove(3));
        System.out.println(names);
        names.remove("James");

        System.out.println(names);
        System.out.println("We removed previously the name :   " + names.remove(3));
        System.out.println(" So now our Array List show's us this Elements: " + names);
        System.out.println(" So lets put back Senior Antonio done and here they are: ");
        names.add("Senior Antonio");
        System.out.println(names);
        System.out.println(numbers);
        System.out.println("numbers add lucky number 7 and lucky number 4 ");
        numbers.add(4);
        numbers.add(7);
        System.out.println("The new numbers are : " + numbers);
    }
}
