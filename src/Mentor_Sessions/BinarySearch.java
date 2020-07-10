package Mentor_Sessions;

public class BinarySearch {
    /*
                                BINARY SEARCH
1) Array should be sorted;
        Arrays.binarySearch(your_of_array);
        1) {1,3,5,6,8,9,10,12,14,15} => 8 -> 4
        length / 2 = 5
        2) {1,3,5,6,8}
        length / 2 = 2
        3) {6,8}
        length / 2 = 1
        {1,3,5,6,8,9,10,12,14,15}
        int start = 0;
        int end = lengths-1; //10
        int midle = start + end / 2; // 5
        1 st = arr[midle] -> 9
        end = middle - 1;//   4 reasigning end to midle
        start = 0; // didnt touch start
        middle = start + end / 2;    // 2 -> new middle
2nd = arr[middle]; // 5
        start = middle + 1;   //3
        end = 4;   // remain same
        middle = start + end / 2; // 3
3rd = arr[middle]; // 6
        start = middle + 1;   // 4
        end = 4;   // remain same
        middle = start + end / 2; // 4
     */
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,8,10,123,145,167,189,200};
        System.out.println(binarySearch(arr, 2));
    }
    // Implement Bubble sort -
    // Implement binary search with String[]
    public static int binarySearch(int[] arr, int val){
        int beginning = 0;// Declare left boundary
        int end = arr.length -1; // Declare right boundary
        int mid = end / 2; // Declare middle
        for( ;beginning <= end; mid = (end + beginning) / 2){ // Loop until left boundary is < than right boundary or value is returned,
            // Each iteration recalculate the middle based on left and right boundaries
            if(arr[mid] == val) return mid; // If it's the value we are looking for return middle(index)
            else{ // If NOT
                if(arr[mid] > val) end = mid - 1; // If value at middle is > than the value we are searching for, move the left boundary to the middle -1
                else beginning = mid + 1; //If value at middle is < than the value we are searching for, move left boundary to the middle +1

            }
            // Repeats until the value is found or beginning > end
        }
        return -1; // Returns -1 if the value we are searching for is not present in our array
    }
}