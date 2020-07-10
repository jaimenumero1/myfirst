package Mentor_homeworks;

public class Array_MathMax {

  public static int[] processMaxNum (int[] nums){
      int [] maxNum = {0};
int maxNum2 = 0;
      for (int i = 0,k = 1;i < nums.length-1;i++,k++){  // before int i reaches the length of the array


          if (nums[i] < nums[k]){
              maxNum2 = nums[k];
          }
      }
      maxNum [0] = maxNum2;
      return maxNum;
  }

    public static void main(String[] args) {

        int [] maximumNum = {130,128,90,80};
        int [] newArray=  Array_MathMax.processMaxNum(maximumNum);
        System.out.println(newArray[0]);



    }
}
