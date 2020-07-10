package tests.testng;


import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import org.testng.
public class TestNGdemo1 {
    // be carefull to always import right imports for test-NG




   // @BeforeSuite()

// be carefull that all imports come from import org.testNG
    @Test
    public  void test1(){
        System.out.println("Hello TestNG");
        Assert.assertEquals(40,50);
    }

    @Test
    public void test2(){
        System.out.println("Hello TestNG 2");
        //Error message in assertion is the last param in TestNG
        //where as it's the first param in JUNIT.
        //actual param is the before expected param.
        Assert.assertEquals(40,50,"Test Two Failure");
    }
}
