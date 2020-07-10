package sessions.arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
public class ArraysClass2 {
    public static void main(String[] args) {
        int[] carYears = {2011,2020,2012,2019};
        System.out.println(Arrays.toString(carYears));
        String arrayString = Arrays.toString(carYears); //=> [2011, 2020, 2012, 2019]
        System.out.println(arrayString);
        String[] names = {"John", "Elon", "Jeff", "Melanie"};
        System.out.println(Arrays.toString(names));
        double[] prices = {10.99, 23.99,44.5, 1.99, 1.98};
        double[] pricesDuplicate =Arrays.copyOf(prices,prices.length);
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(pricesDuplicate));
        Arrays.sort(prices);
        System.out.println(prices); //memory location. //hashcode
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(pricesDuplicate));
        boolean[] answers = {true, false, true, true,false};
        System.out.println(Arrays.toString(answers));
        //Arrays.sort(answers); => no implementation to sort booleans.
        String[] cars = {"Mazda", "bugatti", "Lambo", "1"};
        System.out.println(Arrays.toString(cars));
        cars[1] = cars[1].toUpperCase();
        System.out.println(cars[1]);
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));//B, L, M
        //Uppercases come before lower cases.
        //if in the same case then in alphabetical order.
        //numbers come before the letters.
        //reference to ASCII Table
        //123 => 132
        //132
        //213
        //231
        //312
        //321
        //Binary Search
        int[] shoeSizes = {12,6,7,4,5};
        Arrays.sort(shoeSizes);
        System.out.println(Arrays.toString(shoeSizes));
        int index = Arrays.binarySearch(shoeSizes, 7);
        System.out.println(index);
        System.out.println(Arrays.binarySearch(shoeSizes, 12));
        System.out.println(Arrays.binarySearch(shoeSizes, 10)); //-4 -1 = -5
        //what would be the logic that would tell me that binarySearch
        //didnt find the value in the array.
        //if(Arrays.binarySearch(shoeSizes, 10) < 0)
        System.out.println(Arrays.binarySearch(shoeSizes, 2));
        System.out.println(Arrays.binarySearch(shoeSizes, 0));
        System.out.println(Arrays.binarySearch(shoeSizes, 8));
        System.out.println(Arrays.binarySearch(shoeSizes, 15));
        //5
        //-5
        //shoeSizes[-5*(-1)]
        String[] products = {"apple", "orange", "watermelon", "papaya"}; //binarySearch
        Arrays.sort(products);
        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.binarySearch(products, "papaya"));//you need to provide the array
        //you are searching in first, and the target value(what you are looking for in the array)
        System.out.println(Arrays.binarySearch(products, "oranges"));
        //if the array is sorted and target value is present in the array method return the index of the value(in the sorted array)
        ////if the array is sorted and target value is NOT present in the array method return (negative index of where it would be - 1)
        System.out.println(Arrays.binarySearch(products, "apricots"));//-1-1=-2
        int[] shoeSizes2 = {12,6,7,4,5};
        System.out.println(Arrays.binarySearch(shoeSizes2,7));//undefined value(index)
        //when the array is not sorted and we try to execute binarySearch method
        //we can be sure to get an invalid value(God knows where it is coming)
    }
}
