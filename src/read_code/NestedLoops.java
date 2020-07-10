package read_code;

public class NestedLoops {
    public static void main(String args[]) {
        String str1 = "www.google.com";                //Www.google.com
        String str2 = "World";
        String str3 = "Chrome";
        String str4 = "DevX School";
        System.out.println("Result of Hello: " + method(str1));
//        System.out.println("Result of World: " + method(str2));
//        System.out.println("Result of World: " + method(str3));
//        System.out.println("Result of World: " + method(str4));
    }
    public static boolean method(String input) {
        for (int i = 0; i < input.length(); i++) {
            char charcterOfInputString = input.charAt(i);
            int count = 0;
            for (int j = i; j < input.length(); j++) {
                if (charcterOfInputString == input.charAt(j))
                    count++;
                System.out.println("i " + i +" j " + j);
            }
            if (count > 1)
                return false;//return statement stops the method and return the value.
        }
        return true;
    }
}
