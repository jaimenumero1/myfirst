package sessions.StringMethods;

public class StringPool {
    public static void main(String[] args) {
        //Equals Method
        String st1 = "Hello";
        String st2 = "Hello";
        String st3 = new String("Hello");
        System.out.println("== result for String Pool: " + (st1 == st2));
        System.out.println(".equals() result for String Pool: " + st1.equals(st2));
        System.out.println("== result for Pool vs Heap: " + (st1 == st3));
        System.out.println(".equals() result for Pool vs Heap: " + st1.equals(st3));
    }
}
