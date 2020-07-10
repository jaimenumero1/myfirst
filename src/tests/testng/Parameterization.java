package tests.testng;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization {
    //run same test against different set of data
    //ed: Login
    //positive ->
    //john doe
    //234fggr

    @Test
    // params must match the ones in xml file
    @Parameters({"userName","password"})
    public void loginNegativeTest(String user,String pass){
        System.out.println(user);
        System.out.println("pass");
    }

    @Test
    @Parameters({"quantity","price","isPrime"})
    public void testWithDoubleDataType(int quantity,double price,boolean isPrime){


        System.out.println(quantity*price);
    }
//
//    @Test
//    public void loginNegativeTest2(){
//        System.out.println("johndoe@gmail.com");
//        System.out.println("v3ryh@rdpa$$");
//    }
//    @Test
//    public void loginNegativeTest3(){
//        System.out.println("johndoe@gmail.com");
//        System.out.println("v3ryh@rdpa$$");
//    }
    //Parametarization
    //Lets us run the same test against the data given in xml file.
    //Only one data can be provided and the test can only run aginst one data
    //so if the test-framework user wanted to run the test againt different data
}
