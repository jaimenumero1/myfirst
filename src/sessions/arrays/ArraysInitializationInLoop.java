package sessions.arrays;

public class ArraysInitializationInLoop {
    public static void main(String[] args) {
        int[] evenNumberUntil100 = new int[50];
//        evenNumberUntil100[0] = 0;
//        evenNumberUntil100[1] = 2;
//        evenNumberUntil100[2] = 4;
        //task: even number from - to 100
        int count = 0;
        for (int i = 0; i < 102; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                System.out.println("Count " + count);
                evenNumberUntil100[50] = i;
                count++;
            }
        }
        
        for (int i = 0; i < evenNumberUntil100.length; i++) {
            System.out.println(evenNumberUntil100[i]);
        }
    }
}
