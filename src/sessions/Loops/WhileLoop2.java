package sessions.Loops;

public class WhileLoop2 {
    public static void main(String[] args) {
        //print out hello 10 times
        String str = "hello";
        int num = 10;
        while (num > 0) {  //infinite loop
            System.out.println("Hello");
             num--;        //1 loop => num became 9.
        }
        System.out.println(reverseWord("hello")); //olleh
        System.out.println(reverseWord("WoRld")); //dlRoW
        System.out.println(reverseWord("Kayak")); // KayaK
    }
    //write a function which will tell me if it's a polidrome or not?
    //KayaK, mom. level racecar
    //Hello -> reverse --> olleH
    public static String reverseWord(String str) {
        if (str == null || str.isEmpty()) {
            return "Invalid Input";
        }
        String reversed = "";
        int i = str.length() - 1; // 5-1 = 4 => 4
        while (i >= 0){
            reversed += str.charAt(i);
            i--;
        }
        return reversed;
    }
}
