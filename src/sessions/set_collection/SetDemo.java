package sessions.set_collection;
import sessions.StringMethods.SubString;
import java.lang.reflect.Array;
import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        //HashSet stores unique values and is unordered collection
        Set<String> plateNumber = new HashSet<>();
        plateNumber.add("FNO122");
        plateNumber.add("FNO111");
        plateNumber.add("FNO122");
        plateNumber.add("CHI312");
        plateNumber.add("NYC998");
        plateNumber.add("SF100");
        plateNumber.add("CHI312");
        //output is only unique value in a random order
        System.out.println(plateNumber);
        //Create a list of counties for each student in DevX Summer2020.
        //Find me where are our students from? how many countries.
        //LinkedHashSet stores unique values and is ordered by insertion order.
        //use this for applications that will handle pizza orders.
        Set<String> plateNumber2 = new LinkedHashSet<>();
        plateNumber2.add("FNO122");
        plateNumber2.add("FNO111");
        plateNumber2.add("FNO122");
        plateNumber2.add("CHI312");
        plateNumber2.add("NYC998");
        plateNumber2.add("SF100");
        plateNumber2.add("CHI312");
        //outputs all unique values in the same order they were inserted.
        System.out.println(plateNumber2);
        //TreeSet is used to store unique values, and it orders the values by alphanumerical order
        //Same phone number
        Set<String> plateNumber3 = new TreeSet<>();
        plateNumber3.add("FNO122");
        plateNumber3.add("FNO111");
        plateNumber3.add("FNO122");
        plateNumber3.add("CHI312");
        plateNumber3.add("NYC998");
        plateNumber3.add("SF100");
        plateNumber3.add("CHI312");
        System.out.println(plateNumber3);
        //for each downside can not modify the collection you are looping through.
        //iterator can read all elements + edit the collection
        List<Integer> integerList = Arrays.asList(100, 200, 100, 100, 200, 333, 1444, 555, 777, 777, 666, 666, 222);
        System.out.println(integerList);
        Set<Integer> uniqueNumber = new HashSet<>(integerList);
        System.out.println(uniqueNumber);
        //convert unordered set to alphabetical ordered set
        Set<String> plateNum = new TreeSet<>(plateNumber);
        System.out.println(plateNum);
        plateNum.remove("FNO111");
        System.out.println(plateNum);
        plateNum.clear();
        if (plateNum.isEmpty()) {
            System.out.println("NO plates Left " + plateNum.size());
        } else {
            System.out.println("We have " + plateNum.size() + " plates available");
        }
        if (uniqueNumber.contains(666)) {
            uniqueNumber.remove(666);
        }
        System.out.println(uniqueNumber);
        //Set does not have get by index method. So we are unable to get the values based on positions.
        //How do access the elements in Set?
        //1. using for each loop for reading only.(cant use regular for loop bc no indexes available)
        //2. using iterator for reading and modifying the collection we are looping through
        for (int num : uniqueNumber) {
            if (num == 200) {
                //ConcurrentModificationException -> save this example for the question of what kind of exceptions do you know.
                //uniqueNumber.add(400);
            }
            System.out.println(num);
        }
        //Iterator is a mechanism which allows us to iterate through the collections.
        //Iterator is also a collection of elements.
        Iterator<Integer> iteratorUniqueNumber = uniqueNumber.iterator();
        System.out.println();
        //unknown number of elements. -> cant use for loop.
        //iterator provides as a method which checks if we have a next value. hasNext() -> returns true or false.
        //next and hasNext() have counters(pointers).
        while (iteratorUniqueNumber.hasNext()) {
            //next() ->  returns you a value starting from the beginning. everytime you call next method it will
            //return the next element.
            int num = iteratorUniqueNumber.next();
            if (num == 1444) {
                iteratorUniqueNumber.remove();
            }
        }
        System.out.println(uniqueNumber);
        //if the set contains 200 then add 2222
        if (uniqueNumber.contains(200)) {
            uniqueNumber.add(2222);
        }
        System.out.println(uniqueNumber);
        //in order to use iterator twice we have to make sure to create a new iterator, bc the previous while loop
        //moved the iterator pointer to the end.
        iteratorUniqueNumber = uniqueNumber.iterator();
        while (iteratorUniqueNumber.hasNext()) {
            System.out.println(iteratorUniqueNumber.next());
        }
        //removeAll(collection) -> removes all elements.
        //what is the difference between removeAll and clear?
        // clear() -> removes all elements in the collection
        //removeAll(collection) will remove all elements which are present in the given collection(param) from the set.
        //with remove all we are choosing multiple values to be removed
        //if the collection that we are passing to remove all contains a value not present in the original collection
        //it's ignored and does nothing.
        List<Integer> nums = Arrays.asList(777,555,2222,8);
        uniqueNumber.removeAll(nums);
        System.out.println(uniqueNumber);
        //addAll(Collection) -> adds the values in a collection that is being passed to param
        //to the collection which we are calling the addAll method from
        //use addAll when you have to merge two collections.
        Set<Integer> numsSet = new HashSet<>(Arrays.asList(99,11,23));
        uniqueNumber.addAll(numsSet);
        System.out.println(uniqueNumber);
    }
}
