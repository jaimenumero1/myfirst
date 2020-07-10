package sessions.operators;

public class ButterPriceCalculator {

    public static void main(String[] args){

       /* double butterPrice = 10.99;
        double serviceFee = 1.99;
        int taxPercent = 2;
        double tipPercent = 2.5;

        double totalWithoutTip = (butterPrice+serviceFee)*taxPercent/100;

        double total = totalWithoutTip*tipPercent/100;*/


        double butterPrice = 10.99;
        double serviceFee = 1.99;
        int taxPercent = 2; //2% tax from butterPrice+serviceFee;
        double tipPercent = 2.5; //2.5% butterPrice+ServiceFee+tax

        double tax = (butterPrice + serviceFee) * taxPercent/100;

        double totalWithoutTip = butterPrice + serviceFee + tax;

        double tip = (totalWithoutTip * tipPercent/100);

        double total = totalWithoutTip + tip;

        System.out.println(total);
    }
}






