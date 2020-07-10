package sessions.set_collection;
import java.util.*;
public class Sets_1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("James");
        set.add("Joe");
        set.add("Lola");
        set.add("Jane");
        set.add("Joe");
        set.add("Linda");

      //  set.add("James");
      //  set.add("Joe");
      //  set.add("Linda");
        // Provide the same type for your iterator that is the type of the collection you iterate through
        Iterator<String> iterator = set.iterator(); // Iterator declaration.
        // When declaring an iterator you should specify the DataType should be the same as the collection you iterate th
        // hasNext() returns true if iterator has a next element
        // 1, 2, 4, 5
        //
        for(String s : set){
            System.out.println(s.toLowerCase());
        }
// You can not remove elements directly from a collection while iterating through the collection using iterator
        // You can Only remove using iterator .remove() method
        System.out.println(set);
        while (iterator.hasNext()){ //hasNext() returns true if there is an element following after the current element
            String curr = iterator.next();
            System.out.println(curr);// Method of a set
            if(curr.equals("James")) iterator.remove(); // Method of an iterator that will remove an element of a current iteration
            //if(curr.equals("James")) iterator.remove();
        }
        iterator = set.iterator();
        System.out.println(set);
    }
    public static void calc(Scanner c){
        Set<String> listOfOperations = new HashSet<>(Arrays.asList("+", "-"));// LIst of operations that our calc can perform stored in a set
        System.out.println("ENter a number: ");
        int i = c.nextInt();
        System.out.println("ENter anothe number: ");
        int i2 = c.nextInt();
        c.nextLine();
        String operator = "";
        do{ // Continuasly ask user to enter an operator if the enetered operator is not a part of our listOfOperations set
           System.out.println("Enter the operator (+, -)"); // & a
           operator = c.nextLine();
        }while (!listOfOperations.contains(operator));// While the users input is not present in listOfOperations
        if(operator.equals("+")) System.out.println(i + i2);
        else System.out.println(i - i2);
    }
public static void contains(){
    Set<String> set = new HashSet<>();
    set.add("James");
    set.add("Joe");
    set.add("Linda");
    System.out.println(set);
    System.out.println(set.contains("Molly"));// returns true if current set contains the given element
}
    public static void empty(){
        Set<Integer> set = new HashSet<>();   // Creating an empty Hash set
        for(int i = 0; i < 100; i++){
            set.add(i);
        }
        System.out.println(set);
        set.clear();// Clear method removes all elements from the set, the result will be an empty set
        System.out.println(set);
        set.add(0);
        System.out.println(set.isEmpty());
    }
    public static void createSet(){
        Set<Integer> set2 = new HashSet<>();// Creating an empty Hash set
        List<Integer> ls = new ArrayList<>();// Created an empty ArrayList
        ls.addAll(Arrays.asList(1,2,3,4,5,6,4,5,6));// adding values from a different list
        //Arrays.asList(arguments)  constructs an immutable List with elements that are provided
        Set<Integer> set = new HashSet<>(ls);// Created a new Set an copied values from a provided List
        // Removes duplicates from an array list
        System.out.println(ls);
        System.out.println(set);
    }
    public static void remove(){
        Set<Integer> set = new HashSet<>();   // Creating an empty Hash set
        for(int i = 0; i < 100; i++){
            set.add(i);
        }
        System.out.println(set);
        for (int i = 0; i < 20; i++){
            set.remove(i);
        }
        System.out.println(set);
//        System.out.println(set.size()); // size method return a size of a set
    }
}