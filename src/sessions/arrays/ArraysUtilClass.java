package sessions.arrays;

import java.util.Arrays;
public class ArraysUtilClass {
    
    //Arrays Class
    public static void main(String[] args) {
        String[] bugs = {"Beetle", "LadyBug", "Cricket"};
        System.out.println(Arrays.toString(bugs));
        int[] studentAges = null;
        System.out.println(Arrays.toString(studentAges));
        studentAges = new int[0];
        System.out.println(Arrays.toString(studentAges));
        int[] studentAges2 = {33, 31, 30, 25, 29, 28};
        System.out.println(Arrays.toString(studentAges2));
    }
}
