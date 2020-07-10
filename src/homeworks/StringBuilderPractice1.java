package homeworks;

public class StringBuilderPractice1 {
    public static void main(String[] args) {
        StringBuilder removeChi = new StringBuilder("Chicago");
        StringBuilder alsoChicago = removeChi;
        System.out.println("This is also Chicago ==> " + "\n" + alsoChicago);

        alsoChicago.append(" Hello World");
        alsoChicago.reverse();
        System.out.println("Reversed \t-------->\t\t" + alsoChicago);
        System.out.println();
        System.out.println(" Wow StringBuilder is Coool");
    }
}
