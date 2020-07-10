package sessions.arrays;

import java.util.Arrays;
public class StringMethodsThatReturnArrays {
    //There are some methods in String
    //that return arrays
    //String.toCharArray();
    //String.split(String str);
    public static void main(String[] args) {
        //toCharArray of a String return all characters
        //of a String in an array
        //ex: String str = "Hello";
        //    char[] strChars = str.toCharArray();
        //                    same as
        //    char[] strChars = {'H','e','l','l','o'}
        String str = "Hello";
        char[] strArr = str.toCharArray(); //{'H', 'e', 'l', 'l', o'}
        System.out.println(strArr.toString());
        for (int i =0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        //print out each char in a new line
        //Collections: List(ArrayList, LinkedList), Set(HashSet, LinkedHashSet, TreeSet)
        //Map(HashMap, LinkedHashMap, TreeMap)
        for (char c : strArr) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(strArr));
        //Convert Third Character in a String
        String hello = "World";
        String sss = "DevX School";
        String newStr = hello.substring(0,2).concat("L").concat(hello.substring(3));
        System.out.println(newStr);
        //better implementation(give the logic)
        //what is the implementation of the method means - what is the body of the method
        char[] helloArr = hello.toCharArray();
        helloArr[2] = 'L';
        System.out.println(helloArr);
        //count the vowels in devXArr
        char[] devXArr = sss.toCharArray();
        int count = 0;
        for (int i = 0; i < devXArr.length; i++) {
            char c = devXArr[i];
            if (c == 'o'){
                count++;
            }
        }
        System.out.println(count);
        count = 0;
        for (char c : devXArr) {
            if (c == 'o'){
                count++;
            }
        }
        System.out.println(count);
        // Split method can split a String based on the character(regex) given
        // returns String[]
        // String word = "Hello World";
        //String[] words = word.split(" "); //{"Hello", "World"}
        //String[] words = word.split("l"); //{"He", "o Wr", "d"}
        System.out.println();
        String word = "Hello World";
        String words[] = word.split(" ");
        System.out.println(Arrays.toString(words));
        for (String w : words) {
            System.out.print(w);
        }
        words = word.split("");
        System.out.println(Arrays.toString(words));
        //count the number of words in a String
        String str1 = "Hello Beautiful. World I am an SDET";
        String[] wordsArr = str1.split(" ");
        System.out.println(wordsArr.length);
        //count number of sentences
        //We can achieve format rules for Strings with regex
        //ex: make sure the format of the String is email -- @ and .com
        //make right ssn format 3 number - 2 numbers - 2 numbers
        String[] sentences = str1.split("\\.");
        System.out.println(Arrays.toString(sentences));
        System.out.println(sentences.length);
    }
}
