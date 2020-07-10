package tests;
import org.junit.*;
//Run all of the tests in JunitDemo2 class
public class JunitDemo2 {
    @BeforeClass //runs only once before the whole test execution of the class. (BeforeClass runs once before the whole
    //test suite)
    //Before Class annotation method should be static.
    public static void beforeClassHook(){
        System.out.println("Before Class");
    }
    @Before
    public void beforeHook() {
        System.out.println("Before");
    }
    //Can you please tell me how write a test method?
    @Test //=> test annotation
    public void test1() {
        System.out.println("Test 1");
    }
    @Test //Run a single test separately.
    public void test2() {
        System.out.println("Test 2");
        System.out.println("XXX".charAt(4));
    }
    @Ignore
    @Test
    public void test3() {
        System.out.println("Test 3");
        System.out.println("XXX".charAt(4));
        System.out.println("Test 3 - After Exception");
    }
    @After
    public void afterHook() {
        System.out.println("After Hook");
    }
    @AfterClass
    public static void afterClassHook(){
        System.out.println("After Class Hook");
    }
    /*
    Junit:
    Testing framework to write unit tests. (Original purpose it was created)
    SDET - we barrow a lot of the devs tools. SDET and Devs share 80-90% tools.
    Unit test -
    Test performed on a single method.
    Junit is the most popular open source JAVA testing framework that is used to automate unit tests. In other words we can test java methods of the application under test.
    Junit provides an ability to execute tests in a easy manner by using Junit Annotations like @Test, @Before, @After etc. Annotatinons must put over the test in order for java to recognize the method as a Junit Test.
    Unit tests  - are the lowest level of automated tests performed in the application source code.
    Best testing practices:
    1. Tests should written in a way that they should have scenario for failure.
        Dont write tests which always pass.
    When does a junit test method fail?
    1. When we have exceptions thrown from that method.
    2. When the test results do not match(expected not matched with actual result). AKA  - Assertion error.
    One test failure in 100 tests will cause the final test result of 100 tests to be red(Failed).
    Compile time error in just one class in the whole project with 1000 classes will not allow the project to compile and be built.
     */
}
