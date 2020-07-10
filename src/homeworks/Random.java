package homeworks;

public class Random {
    public static void main(String[] args) {

        int randomNumber = new java.util.Random() .nextInt(10)+ 1;
        System.out.println(randomNumber);
        int randomNumber1 = new java.util.Random().nextInt(22);
        System.out.println("this is second one:"+ randomNumber1);
    }
}
