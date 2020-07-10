package tests.testng;

import org.testng.annotations.Test;

public class TestNGGroupDemo {
    // Test in TestNG can be grouped so that we acn choose
    //which tests to run based on the groups
    //ex: I have 500 test cases (tc)
    //100 of them are checkout tests -> make thseese tests one group
    // by using groups feature in testNG

    @Test(groups = {"checkout"})
    public void test1(){
        System.out.println("Checkout Test One");
    }
    @Test(groups = {"checkout"})
    public void test2(){
        System.out.println("Checkout Test Two");
    }
    @Test void test3(){
        System.out.println("Checkout Test Three");
    }
    @Test(groups = {"search"})
    public void test4(){
        System.out.println("search test 1");
    }
}
