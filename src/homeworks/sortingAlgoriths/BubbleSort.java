package homeworks.sortingAlgoriths;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort call = new BubbleSort();
        int[] newArr = new int[12];

        for(int i =0;i< newArr.length;i++){
            int  randomNum = new Random ().nextInt(12)+1;
            newArr[i] = randomNum;
        }
        System.out.println(Arrays.toString(newArr));
        call.bubbleSort(newArr);
        System.out.println();
        System.out.println("The sorted array is:" + Arrays.toString(newArr));
    }

    public int[] bubbleSort(int[] list){
        int i,j,temp=0;
        for(i=0;i<list.length;i++){
            for(j=0; j < list.length-1-i;j++){
                if(list[j] > list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }
}
