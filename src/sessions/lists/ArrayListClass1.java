package sessions.lists;
import java.util.ArrayList;
import java.util.Arrays;
//or we can delete two imports above
//and bring everything from util package
//import java.util.*;

public class ArrayListClass1 {

    public static void main(String[] args) {
        //List -- ArrayList
        //     -- LinkedList
        //Lists -- is the collection which can store only
        //object, no primitives.

        //Why do we need List when we already have arrays
        //which can store both primitives and non primitives?

        //1. List have a lot of handy methods
        //2. List are resizeable. When dont have to provide the size
        //when initializing our list. So we can add as many elements
        //as needed.

        //What is the problem with array being fixed size?
        //1. we cannot add more elements than the given size.
        //ex: we have to be 100% sure how many elements we will have.
        //2. if we populate the array with less elements than it's size
        //there will be a lot of default values hanging around.

        //we need to import ArrayList from java.util package.
        //1. import java.util.ArrayList; -> make only ArrayList available from that package.
        //2. import java.util.*;       * -> wildcards(everything)
        //bring and make all of the classes in util package available in this class.


        //with array we can only store elements with the same data type.
        //with lists we can store elements with different data types. BUT, that's not a common practice.




        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));//[10, 2, 0, 0, 0]
        //String[] strArr = {"Hello", "hi"}

        ArrayList namesList = new ArrayList();
        //compared to arrays we can just pass reference to ArrayList in the sysout and it will
        //give an output similar to Arrays.toString(arr);
        namesList.add("Elena");
        namesList.add(true);
        namesList.add(123);
        System.out.println(namesList);


        //Unlike arrays we dont have a way to initialize elements like  -> {"Yellow", "Black", "Blue"};
        ArrayList<String> colorsList = new ArrayList<String>(10);//creates a size with default values for all elements.
        //but the size is not fixed arraylist will still be able to resize and grow.
        colorsList.add("Yellow");
        //colorsList.add(123);doesnt compile bc colorsList has <String> which means this list can only store Strings
        colorsList.add("Black");
        colorsList.add("Blue");
        System.out.println(colorsList);//toString method


        ArrayList<String> colorsListDup = new ArrayList<>(colorsList); //String[] strArr = new String[5];
        //copies the values from the list that was passed to the params.
        System.out.println(colorsListDup);



        //ArrayList<int>  --> doesnt compile List dont support primitive data types.
        //Java provides wrapper classes for all of the primitives.
        //Object representations of the primitive data types.
        //Integer i = 0;
        Integer num = new Integer(0);
        //literals -> this will convert primitive data type literals to Wrapper classes.
        Integer i = 0;//(new Integer(0))
        //Integer i = 0; is a preferred way there is no cost to performance at all.
        int num2 = i;

        //whole process of being able to assign values from primitive to wrapper class and vice versa
        //autoboxing

        //Wrapper classes have methods.
        //Wrapper classes are immutable

        //Wrapper classes are work around for not being able to store primitive data types in Collections(List,Set, Map)
        //Also, Wrapper classes have some methods.
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(new Integer(100));
        nums.add(200);
        System.out.println(nums);

        ArrayList<Character> grades = new ArrayList<>();
        grades.add('c');
        grades.add('d');
        System.out.println(grades);














    }
}



