package homeworks;

import java.util.Arrays;

public class Interview {

//    Task: Given an array nums with integers already assigned, write code to reverse
//    it.Do not use any additional arrays or Strings.  Example:nums ->
//            [4, 3, 2, 44, 1, 100, 55]change it to:nums -> [55, 100, 1, 44, 2, 3, 4] 

    public static void main(String[] args) {

    int [] nums = {4,3,2,44,1,100,55};
    int len = nums.length-1;

    for(int i =0,k=len; i < nums.length/2; i++,k--){
         int temp=0;
         temp=nums[i];
        nums[i] = nums[k];
        nums[k]=temp;
        // some comments


    }
        System.out.println(Arrays.toString(nums));
}



}
