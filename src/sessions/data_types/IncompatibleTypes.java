package sessions.data_types;

public class IncompatibleTypes {
    public static void main(String[] args) {
        double d = 25.2;

        //we cannot implicitly cast decimals to whole numbers..
        //int num = d; doesnt compile incompatible types error
        int num = (int)d;
        System.out.println("explicitly casted double to int: " + num);

        //long longNum = d;
        long longNum = (long)d;
        System.out.println("explicitly casted double to long: " + longNum);

        float fNum = 223.2f;

        //int intNum2 = fNum;
        int intNum2 = (int)fNum;
        System.out.println("explicitly casted float to int " + intNum2);

        int intNum3 = 1;
//        short a = intNum3;


        float floatNum = 1231.2123f;

        double doubleNum = floatNum;

//        float aF = doubleNum;






        //////// implicit Casting
        // When converting smaller memory size data types to bigger ones we dont need to give explicit casting operand
        // We can implicitly cast whole number to decimals.
        //we cannot implicitly cast decimals to whole numbers..

        int i = 1000;
        double doubleNum5 = (double)i;

        System.out.println("Implicitly Casted int to double " + doubleNum5);

        short shortNum = 1222;

        int x = shortNum;

        int xy = 123123;

        short shortNum2 = (short)xy;

        System.out.println(shortNum2);


    }
}





