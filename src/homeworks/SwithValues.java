package homeworks;

import javax.crypto.spec.PSource;

public class SwithValues {
    public static void main(String[] args) {


        int number = 10;
        int number2 = 19;

        int three = 9;

        number += three;
        number2 -= three;



        int temp;
        temp = number;  // that 10
        number = number2;
        number2 = temp;

        number2 = temp;   // you assign num2 to temp 10
        number = number2;


        System.out.println(number);
        System.out.println(number2);

    }
}
