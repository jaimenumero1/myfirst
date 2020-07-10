package Java_For_Dummies;

public class ReverseAStringAgain {

    public static void main(String[] args) throws InterruptedException {


        String str = "Hello World";
        int loopCount = str.length() - 1;
        int start = 0;
        String reversed = "";

        while (loopCount >= start){
            reversed = reversed + str.charAt(loopCount);
            System.out.println(reversed);
            Thread.sleep(888);
            loopCount--;
        }
        System.out.println(reversed);
    }
}