package sessions.StringMethods;

public class Replace {
    public static void main(String[] args) {
        //Replace
        String str = "Doe";
        //override the "Doe" with Joe
        str = str.replace('D', 'J');
        System.out.println(str);
        //Hello
        //heyyo
        String str1 = "Hello";
        str1 = str1.replace('l', 'y');
        System.out.println(str1);
        //it is overloaded method that can change Strings
        str1 = str1.replace("Hey", "We");
        System.out.println(str1);
        String str2 = "Hellollllllll";
        System.out.println(str2.replace('l', 'L'));
        String str3 = "what a beautiful world";
        System.out.println(str3.replace("beautiful", "amazing"));
        String str4 = "Hello";
        //ReplaceFirst --> returns String which the first occurrences of the given char modified
        str4 = str4.replaceFirst("l", "L");
        System.out.println(str4);
        // str4.isEmpty() ==> return true if the String is empty - "";
        //as pre conditions
        String countNumberOFZ = "";
        int index = 0;
        int count=0;
        while (index < countNumberOFZ.length()){
            if (!countNumberOFZ.isEmpty()) {
                if (countNumberOFZ.charAt(index) == 'Z') {
                    count++;
                }
                index++;
            }
        }
        System.out.println(count);
        if(!countNumberOFZ.contains("Credit Card")){
        }
        
        
    }
}
