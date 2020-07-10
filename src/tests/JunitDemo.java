package tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitDemo { //run button on the class level will run all of the tests inside the class
    //Tests run in an alphabetical order of the method names.
    //Rule(Best Testing Practice)  -- Tests must be independent
    //one test result should not any how affect other tests results.
    @Test//gives me a result of the below method executed. If there are no failures
    //this test will be reported as passed
    public void test1() {//run button on the test method level will run just a single test.
        System.out.println("Test 1");
    }
    @Test//When there is an issue in the method(Exceptions, Assertions).
    //Test will report a failure.
    public void failingTestExample() {
        String str = "Hello";
        System.out.println("Failing Test");
        System.out.println(str);
        System.out.println(str.charAt(6));
    }
    @Test
    public void test3(){
        System.out.println("test3");
        System.out.println("Elon");
        System.out.println(5+10);
        System.out.println(100);
    }
    @Before//will run once before every test
    //Hook is keyword that represents @Before and @After Annotations.
    //Hooks dont have test results.
    //An error in the hook will cause an error of the test.
    //Even though Hooks and Tests are written separately.
    //Once run button is clicked they are treated as a single test.
    public void beforeHook() {
        System.out.println("About to run a test");
        System.out.println("Second before");
    }
    @After//Runs once after every test
    public void afterHook(){
        System.out.println("After Hook");
        System.out.println("Test execution completed");
       // Assert.
    } 
}
