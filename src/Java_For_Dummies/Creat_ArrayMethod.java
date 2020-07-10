package Java_For_Dummies;

import java.util.Arrays;

public class Creat_ArrayMethod {


    public static void main(String[] args) {
        Creat_ArrayMethod call = new Creat_ArrayMethod();

        System.out.println("The largest Word is: " + call.searchLarWord("The weather in Chicagoiiiiii is horrible during the winter timeeeeeeeeeeeeeeeee"));

    }

    public String searchLarWord(String str) {

        String [] newArr = str.split(" ");
        String largeStr = "";

        for (String str2:newArr) {
            if (largeStr.length() < str2.length()){
                largeStr = str2; }
        }

//        for (int i = 0; i < newArr.length;i++){
//
//            if( largeStr.length() < newArr[i].length()){
//                largeStr = newArr[i];}
//            }
        return largeStr;
    }

    /*
        Create a method that would accept an integer array. And returns the largest integer in that array.
        Create a method that would accept an integer array. And returns the second largest integer in that array
        Create a method that would accept a String and return the largest word in that String
        EX: input: "The weather in Chicago is horrible during the winter time", Output: "horrible"
         */

}
