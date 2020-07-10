package homeworks.sortingAlgoriths;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] newArr = {8,2,3,0,5,9,2,8};

        int minValue,minIndex,temp =0;


        for(int i = 0;i<newArr.length;i++){
            minValue = newArr[i];
            minIndex = i;
            for(int j = i;j< newArr.length;j++){
                if(newArr[j]<minValue){
                    minValue = newArr[j];
                    minIndex = j;
                }
            }
           if(minValue < newArr[i]){
               temp = newArr[i];
               newArr[i] = newArr[minIndex];
               newArr[minIndex] = temp;
           }
        }
        System.out.println("Sorted Array :" + Arrays.toString(newArr));
    }
}
