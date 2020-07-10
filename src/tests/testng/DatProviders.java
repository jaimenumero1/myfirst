package tests.testng;

import org.testng.annotations.DataProvider;

public class DatProviders {

    //Data Providers are used to run one(same) test against multiple test data
    //Object array can store any value except primitive data types, use wrappers in this case.

    @DataProvider(name = "loginTestData")
    public static Object[] [] loginDataTestMethod (){
    return new Object[] [] {
            {"johnDoe@gmail.com","123pass"},
        {"johnDoe", "333pass"},
            {"johnDoe@gmail.com","a"},
            {"johndoe@gmail.com","0078"}};
    }

}
