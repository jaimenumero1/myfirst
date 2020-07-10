package homeworks;

public class NestedLoop {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 5; i++){
                Thread.sleep(600);
            for(int j = 1; j<=5; j++){
                System.out.print((i*j)+ " ");
                Thread.sleep(1200);
            }
            System.out.println();
        }
    }
}
