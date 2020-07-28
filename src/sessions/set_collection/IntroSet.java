package sessions.set_collection;

import java.util.*;

public class IntroSet {
    public static void main(String[] args) {
        Set<String> authors = new HashSet<>();
        authors.add("Aitmatov");
        authors.add("Rowland");
        authors.add("Kristi");
        authors.add("Aleksandr");
        authors.add("Chika");
        authors.add("Aitmatov");

        System.out.println(authors);
        // HashSet is a unpredictable order
        // in array list you can store alot of duplicate values
        // in Set you can not store duplicates
        //
        Set<String> authors2 = new LinkedHashSet<>();
        authors2.add("Pushkin");
        authors2.add("Aitmatov");
        authors2.add("Rowland");
        authors2.add("Kristi");
        authors2.add("Aleksandr");
        authors2.add("Chika");
        authors2.add("Aitmatov");
        System.out.println(authors2);

        Set<String> authors3 = new TreeSet<>();
        authors3.add("Pushkin");
        authors3.add("Aitmatov");
        authors3.add("Rowland");
        authors3.add("Kristi");
        authors3.add("Aleksandr");
        authors3.add("Chika");
        authors3.add("Aitmatov");
        System.out.println(authors2);

        System.out.println(authors3);

        System.out.println();
        List<Integer> nums = Arrays.asList(123,44,11,3434,11,221,3434,123,44);
        System.out.println(nums);
        Set<Integer> uniqueNums = new HashSet<>(nums);
        System.out.println("unique values unordered: "+ uniqueNums);
        // thats the whole point of set to have only unique values

        Set<Integer> unqueNumsLinkedSet = new LinkedHashSet<>(nums);
        System.out.println("insertion order preserved " + unqueNumsLinkedSet);

        Set<Integer> unqueNumsLinkedTree = new TreeSet<>(nums);
        System.out.println("ascending Order " + unqueNumsLinkedTree);

        Set<Integer> unqueNumsLinkedTree1 = new TreeSet<>(Comparator.reverseOrder());
        unqueNumsLinkedTree1.addAll(nums);
        System.out.println("Decending Order " + unqueNumsLinkedTree1);
        System.out.println(authors3);

        SortedSet<String> authors33 = new TreeSet<>(authors3);
        System.out.println(authors33.subSet("Chika","Rowland"));

    }
}
