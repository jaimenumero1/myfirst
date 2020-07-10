package InterviewQueshtions;

import java.util.Arrays;

public class TwoNumberSum {
    public static void main(String[] args) {
        int [] array = new int[8];
        array [0] = 3;
        array[1] = 5;
        array[2] = -4;
        array[3] = 8;
        array[4] = 11;
        array[5] = 1;
        array[6] = -1;
        array[7] = 6;

        int [] newArr =   {3,5,-4,8,11,1,-1,6};
        Arrays.sort(newArr);
        //{-4,-1,1,3,5,6,8,11}
        System.out.println(Arrays.toString(newArr));
        int temp = 0;


    }

}
