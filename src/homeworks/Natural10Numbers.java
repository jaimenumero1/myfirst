package homeworks;

public class Natural10Numbers {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("The first 10 natural numbers are:");
        int num1 = 1;

        while ( num1 < 11 ){
            System.out.println(num1);
            Thread.sleep(800);
            num1++;
        }
    }
}
