package sessions.operators;

public class MixedDataTaypeMathOperators {
    public static void main(String[] args) {

        System.out.println(100/1.0);// converts 1 to double first
        // then carries out division of 100.0/1.0

        int result = 250/(int)2.0; // to cast you must have the (int) in front of
        // the one you want to cast
        int result1 = (int) (250/2.0); // this also works
        System.out.println(result);

        double result2 = (double)9 / 5 * 20.1; // gives double because we have at least one decimal
        // pointed value (20.1)
        // 9/5 first division both numbers are integers so we treat as integers
        // 9/5 = 1;
        //1 ==> 1.0 * 20.1
        // result2 =>20.1
        // need to add double in parenthesis to explicitly cast to get exact result 36.18

        System.out.println(result2);




    }
}
