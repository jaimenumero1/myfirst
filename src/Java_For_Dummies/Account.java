package Java_For_Dummies;

public class Account {

    String name;
    String address;
    double balance;

    public void display() {
        System.out.print(name);
        System.out.print(" (");
        System.out.print(address);
        System.out.print(") has $");
        System.out.print(balance);
    }
        public double getInterest(double percentageRate) {
        return balance * percentageRate /100.00;
        }
}


















