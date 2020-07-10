package sessions.operators;

public class CompoundAssignmentOperators {

    public static void main(String[] args){

        int num1 = 10;
        int num2 = 50;

        // num1 =10 + 50; can do this way but reusing variables is better
        num1 = num1 + num2;// = the right side is executed first.

        num2 =110 + num1;// answer is 170 because of num1 is changed by previous equation

        System.out.println(num2);



        num2 = num2 + 20;// 190
        System.out.println(num2);


        //When you are seeing the variable that you are trying to reassign the value of
        // in the right side of the = sign.
        // we reuse the value the variable had before.



        num2 = num2 + num2;// num2 = 190 +190
        System.out.println(num2);//380

        num2 = num2 * num2 + num2 ;

        System.out.println(num2);

        double balance = 10000.00;
        double totalSpending = 0;
        totalSpending = 100.00;
        totalSpending = totalSpending +50;// totalSpending = 100 + 50 = 150
        totalSpending = totalSpending +25;// totalSpending = 150 + 25 = 175
        totalSpending = totalSpending + 700;
        System.out.println();
        System.out.println(balance-totalSpending);

        System.out.println("Balance " + balance);
        balance = balance-totalSpending;
        System.out.println(balance);//9125

        // Since you have money you can keep spending
        // compound assignment operators
        //+ compound
        totalSpending += 100;//
        totalSpending += 200;// totalSpending + totalSpending +200; 1175

        //passive income
        int passiveIncome = 1;
        passiveIncome = passiveIncome * 2;

        System.out.println("1st passiveincome results: " + passiveIncome);

        passiveIncome = passiveIncome * 2;

        System.out.println(passiveIncome);

        passiveIncome *= 2;// same as passiveIncome = passiveIncome * 2;

        System.out.println(passiveIncome);

        //division
        int number = 500;
        number /=2;
        System.out.println(number);












        System.out.println("Num1 after first addition: "+ num1);


    }
}
