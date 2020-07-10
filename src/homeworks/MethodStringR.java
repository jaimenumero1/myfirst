package homeworks;

public class MethodStringR {

    public static String helloName(String greeting) {
        String greetingAdd = "\"Hello ";
        String exclamation = "!\"";
        return greetingAdd + greeting + exclamation;
    }

    public static void main(String[] args) {

        String greeting2 = (helloName("Bob"));
        System.out.println(greeting2);

        System.out.println();
        System.out.println(helloName("Alice"));
        System.out.println();

        String lastName    = helloName("Mr X");
        System.out.println(lastName);




    }
}
