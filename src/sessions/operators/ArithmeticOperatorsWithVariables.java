package sessions.operators;

public class ArithmeticOperatorsWithVariables {

    public static void main(String[] args){
        int num1 = 1099;
        int num2 = 6100;

        //System.out.println(1099+6100);
        System.out.println(num1 + num2);

        //variables help you ease your work. which makes your program easy to maintain.
        //How much customer pays
        double butterPrice = 10.99;
        double serviceFee = 1.99;

        int taxPercent = 2;
        double tipPercent = 2.5; //totalWithoutTip * 2.5/100 ==> 2.5% of totalWithoutTip
        //0.025

        System.out.println("Find butterPrice, service fee  and tax total + the tip ");
        //                 10.99 + 1.99 + (10.99 * 2 /100)
        System.out.println(10.99 * 2 /100); //tax //0.2198
        //System.out.println(10.99 + serviceFee + (10.99 * taxPercent/100)); hardcoded version.

        System.out.println((butterPrice + serviceFee + (butterPrice * taxPercent/100))*tipPercent/100 + (butterPrice + serviceFee + (butterPrice * taxPercent/100)));

        double oneButterPriceTax = butterPrice * taxPercent/100;

        System.out.println(((butterPrice + serviceFee + oneButterPriceTax) * tipPercent/100 + (butterPrice + serviceFee + oneButterPriceTax))/2);

        double totalWithoutTip = butterPrice + serviceFee +oneButterPriceTax;

        System.out.println(totalWithoutTip * tipPercent/100 + totalWithoutTip);

        double total = totalWithoutTip * tipPercent/100 + totalWithoutTip;

        System.out.println(total);
    }
}





