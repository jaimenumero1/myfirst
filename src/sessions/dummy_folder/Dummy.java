package sessions.dummy_folder;

import java.util.concurrent.atomic.AtomicInteger;

public class Dummy {


    public static String replaceSO(String str){
// 1) locate the last index of so
// 2) cut the string from beginning until the index of so
// 3) cut after so until the end of the string
// 4) concatinate 2 + "great" + 3        // We are so so programmers // 1st: We are so // 2nd:  programmers


            int lastIndexOfSo = str.lastIndexOf("so");// locate the index of so from the end --10
            String firstPart = str.substring(0, lastIndexOfSo);// 0, 10
            String secondPart = str.substring(10 + 2);
            return firstPart + "great" + secondPart;    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.length()-2);


        }
    }


