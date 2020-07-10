package sessions.operators;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int x = 10;
        //int y = ++x; increment and give the incremented value in the s
        // same statement
        int y = x++; // give old value

        int yz =122;
        ++yz;
        System.out.println(yz);


        double doubleNum = 12.99;
        System.out.println("1    "+ doubleNum++);
        System.out.println("2     "+ doubleNum);

        long longNum = 1000l;
        System.out.println("long   "+ longNum--);// 1000changes value in nex line
        System.out.println("long   " + longNum);// 999

    }
}
