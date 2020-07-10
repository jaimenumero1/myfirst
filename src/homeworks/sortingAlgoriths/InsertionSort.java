package homeworks.sortingAlgoriths;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int [] newArr = {8,2,3,0,5,9,2,8};
        System.out.println(Arrays.toString(newArr));
        int key = 0;
        int temp = 0;
        int j = 0;

        for(int i = 1;i < newArr.length;i++){
        key = newArr[i];
        j = i-1;
        while (j >= 0 && key < newArr[j]){
        temp = newArr[j];
        newArr[j] = newArr[j+1];
        newArr[j+1] = temp;
        j--;
        }
        }
        System.out.println("This is the sorted Array: " + Arrays.toString(newArr));
    }
}
