package homeworks;

public class HomeWorkSubstring {

    public static void main(String[] args) {

        HomeWorkSubstring two = new HomeWorkSubstring();

        System.out.println( two.firstTwo("Hello"));
        System.out.println(two.firstTwo("abcdefg"));
        System.out.println(two.firstTwo("ab"));
        System.out.println("x");
    }
    public String firstTwo(String str) {
    if ( str.length() < 2) return str;
    return str.substring(0,2);
    }

}
