package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {


//        Given a list of integers, return a list where each integer is multiplied by 2.
//
//
        int [] newArr = new int[3];
        newArr[0] = 2;
        newArr[1] = 4;
        newArr[2] = 6;
        System.out.println(Arrays.toString(multiplyBy2(newArr)));

        //→ [2, 4, 6]
//        doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
//        doubling([]) → []
        List<Integer> nL = new ArrayList<>();
        nL.add(8);
        nL.add(8);
        nL.add(4);
        nL.add(3);



    }
    public static int[] multiplyBy2 (int[] nums){
        int newArr[] = new int[3];
        newArr[0]= 3;
        List<Integer> nL = new ArrayList<>();
        nL.add(8);
        nL.add(8);
        nL.add(4);
        nL.add(3);



        return nums;
    }
}
