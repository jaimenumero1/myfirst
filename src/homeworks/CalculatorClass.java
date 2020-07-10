package homeworks;

import java.lang.reflect.Method;
import java.util.Scanner;

public class CalculatorClass {
    /*
Please write 4 different return type methods for the Calculator class

input numbers  are int a=21;  int b=3;

a) addNumbers(a,b)

b) divideNumbers(a,b)

c) multiplyNumbers(a,b)

d) subtractNumbers(a,b)
*/

    public static void main(String[] args) {


     CalculatorClass method = new CalculatorClass();
        int sum = method.calculateSum(2,2);
        System.out.println("The sum: " +sum);

        int diff = method.calculateDiff(3,3);
        System.out.println("The difference is: "+ diff);

        int product = method.calculateProduct(5,5);
        System.out.println("The product:"+ product);

        int division = method.calculateDivision(8,4);
        System.out.println("Divided it is: "+ division);




    }

    
    
    
    public int calculateSum (int a, int b){
        int sum = a+b;
        return sum ;
    }
    public int calculateDiff (int a, int b){
        int diff = a - b;
        return diff;
    }
    public int calculateProduct (int a, int b){
        int product = a * b;
        return product;
    }
    public int calculateDivision (int a, int b){
        int division = a / b;
        return division;
    }
    
}
