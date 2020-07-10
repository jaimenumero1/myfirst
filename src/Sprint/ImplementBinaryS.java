package Sprint;

import java.util.Arrays;
import java.util.Scanner;

public class ImplementBinaryS {

    public static void main(String[] args) {
        try {

            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("This porgram implemets Binary Search to find a number");
            System.out.println("Choose Array size ");
            int arrSize = input.nextInt();

            int[] newArr = new int[arrSize];

            int num = 1;
            for (int i = 0; i < newArr.length; i++) {
                System.out.println("Enter number " + num);
                num++;
                int temp = 0;
                temp = input.nextInt();
                newArr[i] = temp;
            }

            ImplementBinaryS s = new ImplementBinaryS();

           newArr = s.bubbleSort(newArr);
            System.out.println();
            System.out.println("Your sorted Array is: ==> " + Arrays.toString(newArr));
            System.out.println();
            System.out.println("This program will now implement binary search ");
            System.out.println("However first we will need a number to look for");
            System.out.println("Please enter: ");

            int numToSearch = input.nextInt();
            int result = s.binarySearch(newArr, numToSearch);

            if (result >= 0) {


                System.out.println("After Binary Search The number is: " + newArr[result]);
                System.out.println("And the index of that number is: " + result);
            } else {
                System.out.println("Sorry your number was not found in Array ");
            }
        } catch (Exception e){
            System.out.println("Program ended ");
            System.out.println("Please rerun and enter valid input's");
        }



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

    public int binarySearch(int[] arr, int val){
       int beginning = 0;
       int end = arr.length -1;
       int mid = end/2;
       for(;beginning <= end; mid = (end + beginning)/2){
           if(arr[mid] == val) {
               return mid;
           }
           else{
               if(arr[mid] > val){
                   end = mid-1;
               }
               else{
                   beginning = mid+1;
               }
           }
       }
       return -1;
    }
}
