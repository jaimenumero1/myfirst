package sessions.operators;

public class ArithmeticOperators {
    //ArithmeticOperators will help us to do math in java
    //add tow numbers etc.

    public static void main(String[] args){
        //add two number and give result
        //hardcoding means giving the exact values in output.
        System.out.println(10+15);
        System.out.println(1000+3242);

        //Subtraction/ minus
        System.out.println(160-60);//100
        System.out.println(2000-200);

        //Multiplication
        System.out.println("Multiplication");
        System.out.println(300*20);//6000
        System.out.println(1*2003);//2003

        //Division
        System.out.println("Division");
        System.out.println(1400/2);//700
        System.out.println(333/3);//111

        System.out.println("How do I find the percentage if % is modulo?");
        //Find the 12 % discount of 100 item
        System.out.println(100*12/100);
        //Find the 12% of discount of $50
        System.out.println(50*12/100);
        //Find 44% discount of 1200 item
        System.out.println(1200*44/100);


        //Be carefull with double quotes because they make number as String(text)
        //Lood out for emty"" or "asdad" in the addition part
        // if the double quotes are before the + sign
        System.out.println("asdfda"+10+15);

        //Modulo -- gives me the remainder of my division

        System.out.println("Modulo");
        System.out.println(10%2);//0
        System.out.println(12%3);//0
        System.out.println(55%2);//1
        System.out.println(44%3);//2

        System.out.println(56%20);
        //Even number ==> a number that is divisible by 2 without a remainder, remainder = 0
        // odd number ==> a number that is not divisible by 2. When divided result will have a remainder.
        System.out.println(42%2);// is even bc remainder is 0 and we are dividing by 2
        System.out.println(43%2);// is odd number bc we are dividing it by 2 and the remainder is 1


        System.out.println("How do I find the percentage if % is modulo?");

        //Find the 12% discount of $100 item
        System.out.println(100 * 12 / 100);
        //Find the 12% discount of $50 item
        System.out.println(50 * 12 / 100);
        //Find 44% discount of $1200 item
        System.out.println(1200 * 44/100);


        //Be Careful with double quotes bc they make number as String(text)
        //Look out for empty "" or "asdad" in the addition part.
        //If the double are before the + sign then the number are treated as String(text)
        System.out.println("  asdasd "+10 + 15);
    }

}



