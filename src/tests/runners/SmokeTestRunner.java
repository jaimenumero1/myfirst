package tests.runners;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.JunitDemo;
import tests.JunitDemo1;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        // List of test classes that you want to run in this group
        // test classes come from our projects. basically the classes that we created
        JunitDemo.class, // all tests within JunitDemo are going to run unless they are ignored.
        JunitDemo1.class// all test within JunitDemo1 are going to run unless they are ignored.@ignore
})

public class SmokeTestRunner {

    // Runner Classes are the classes that can run a specific number of test's
    //ex: choose only test for Smoke
    //ex; choose test's only for cart if it's Amazon
    //ex; choose only test's for Login [Amazon]

}
