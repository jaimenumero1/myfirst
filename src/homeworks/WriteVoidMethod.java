package homeworks;

public class WriteVoidMethod {

    public static void main(String[] args) {

        int mark = 49;
        System.out.println("The mark is: " + mark);
        checkPassFailMethod(mark);

        System.out.println("DONE");
    }

    public static void checkPassFailMethod (int mark1) {
        // if-else statement
        if (mark1 >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
