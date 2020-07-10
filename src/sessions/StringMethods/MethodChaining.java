package sessions.StringMethods;

public class MethodChaining {
    public static void main(String[] args) {
        String str = "lionel messi";
        String result = str.replace('l','L').replace('m', 'M');
        System.out.println(result);



        // Method chaining can only be done because when the method you use is String for ex...
        // and the return type of the method is also String. this allows you to use a String method again

        String newStr = "School Bus";
       String str1 =  newStr.substring(1).toLowerCase().toUpperCase().concat("S").toLowerCase().substring(0,8);
       // this is method chaining here multiple methods are added on top of each other to accomplish something
        // however if the String method returns a primitive type then method chaining from that point on
        // will not be available
        // output is -->   "chool bu"
        System.out.println(str1);

    }
}
