package tests;
import org.junit.Assert;
import org.junit.Test;
import sessions.arrays.ArraysIntersection;
public class ArrayIntersectionTests {
    //intersection method should take 2 int arrays
    //and return an array with
    //the matching values in both arrays
    //if any of the arrays are empty return null;
    //if there are no matching values in neither of the arrays then
    //return empty array.
    //DONT USE - return empty array -- I ASSUME.
    ArraysIntersection in = new ArraysIntersection();
    @Test
    public void twoEmptyArraysTest() {
        //arr1 = {}
        //arr2 = {}
        ArraysIntersection in = new ArraysIntersection();
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = null;
        int[] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("Two arrays are empty failure", expected, actual);
    }
    @Test
    public void oneEmptyArrayTest() {
        //arr1 = {}
        //arr2 = {22};
        ArraysIntersection in = new ArraysIntersection();
        int[] arr1 = {};
        int[] arr2 = {22};
        int[] expected = null;
        int[] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("One Array Empty test Failure", expected, actual);
    }
    @Test
    public void oneEmptyArrayTest2() {
        //arr1 = {44}
        //arr2 = {};
        ArraysIntersection in = new ArraysIntersection();
        int[] arr1 = {44};
        int[] arr2 = {};
        int[] expected = null;
        int[] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("One Array Empty test Failure", expected, actual);
    }
    @Test
    public void noMatchingValuesTest() {
        //arr1 = {20,24}
        //arr2 = {2}
        int[] arr1 = {20, 24};
        int[] arr2 = {2};
        int[] expected = {};
        int[] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("No matching values test failure", expected, actual);
    }
    @Test
    public void twoMatchingValuesTest() {
        //arr1 = {10, 5, 25, 4}
        //arr2 = {3, 4, 60, 10}
        int[] arr1 = {10, 5, 25, 4};
        int[] arr2 = {3, 4, 60, 10};
        int[] expected = {10, 4};
        int[] actual = in.intersection(arr1, arr2);
        //assertEquals => expected == actual. For objects assertEquals compares hashCode.
        //we can loop trough an expected and actual arrays and compare each value in each index.
        //do we have a method that compare the values of arrays?
        Assert.assertArrayEquals("two Matching Values Test Failure",expected,actual);
    }
    
    //Task: Fix Intersection method so that all tests in ArrayIntersectionTests pass.
    //Add more test cases. (edge case) get creative.
}
