package read_code;

public class ArrayCodeRead {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
        int [] arr = {12,9,21,17,33,7};
                // is 6 -1 == 5
        for(int i =0; i <= arr.length-1; i++) {
            // first iteration i =0 6-1-0= 5
            //                      6-1-1=4
            //                      6-1-2=3
            //                we are printing room num 5
            System.out.println(arr[arr.length-1-i] + " ");
        }
    } // 7 33 17 21 9 12
}