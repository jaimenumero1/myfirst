package tests.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        kjhuhjkhjk.class,
        JunitDemo.class,
        JunitDemo1.class,
        TestCompare.class,
        TestConverter.class,
        TestPractice.class
})
public class RegressionRunner {
    //in junit how can we runa before annotation(setpu steps
    //@BeforeClass -> in the runner will run the setpu actions
    //Only once before the test suite.
    @BeforeClass
    public static void setUP(){
        System.out.println("Selenuim open chrome");
        System.out.println("Selenium go to Amazon.com");
        System.out.println("Selenuim make sure my Window is Maximized");
    }
}
