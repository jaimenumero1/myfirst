package tests;

import org.junit.Assert;
import org.junit.Test;
import sessions.Methods.Converter;

public class TestConverter {

    @Test
    public void test1(){
        Converter convert = new Converter();
        int f = (int)convert.convertCtoF(30);
            //first put expected result, second actual result from method.
        Assert.assertEquals(86, f);
    }
}
