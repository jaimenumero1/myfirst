package sessions.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class ArraysClassOne {
    public static void main(String[] args) {
        //Have the name of first 5 students in the zoom
        String[] studentNames = new String[10];
        System.out.println(studentNames[0]);
        studentNames[0] = "Elon Musk";
        System.out.println(studentNames[0]);
        studentNames[1] = "Bill Gates";
        System.out.println(studentNames[1]);
        studentNames[2] = "Melanie Perkins";
        System.out.println(studentNames[2]);
        studentNames[3] = "Jeff Bezos";
        System.out.println(studentNames[3]);
        studentNames[4] = "John Doe";
        System.out.println(studentNames[4]);
        studentNames[1] = "Warren Buffet";
        System.out.println(studentNames[1]);
        System.out.println(Arrays.toString(studentNames));

        String[] clone = studentNames;           //     Creating a clone of first Array
        clone[0] = "hello";                       //    This anything you do to this clone will affect the original array
        System.out.println(Arrays.toString(studentNames));// If you don't want them to point at the same object
        System.out.println(Arrays.toString(clone));       // You wold need to declare them with new key word each
        clone[0] = "Elon Musk";
        System.out.println("Back to Elon ");
        System.out.println(Arrays.toString(studentNames));

    }                                                     // and loop through the first Array to put the values to the second
}
