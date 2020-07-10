package homeworks;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class UseReplaceMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter String to change: ");
        String changeXs = input.next();

        String newChanged = changeXs.replace("x","X");

        System.out.println("Changed:\t\t" + newChanged);

    }

}
