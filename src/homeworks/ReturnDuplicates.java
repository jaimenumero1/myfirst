package homeworks;

import java.util.*;

public class ReturnDuplicates {

    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>();
        int[] newArr = {1, 35, 55, 5, 2, 5, 9, 10, 4, 35, 4, 35};
        System.out.println(duplicates(newArr));

    }


    public static List duplicates(int[] numArr) {
        Map<Integer, Integer> nums = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numArr.length; i++) {
            if (nums.containsKey(numArr[i])) {
                if (result.contains(numArr[i])) {

                } else {
                    result.add(numArr[i]);
                }
            } else {
                nums.put(numArr[i], null);
            }
        }
        return result;
    }
}