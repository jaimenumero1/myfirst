package Mentor_Sessions;

import com.github.javafaker.Faker;

import javax.sound.midi.Soundbank;
import java.util.*;

public class NewLambdas {
    public static void main(String[] args) {
        // Java Faker
        // Implementation of a functional interface
        //functional interface has only one abstract method.

        Faker f = new Faker();
        System.out.println(f.name().firstName());
        List<String> ls = new ArrayList<>();
        for(int i = 0; i < 22;i++){
            ls.add(f.name().firstName());
        }

        Map<String,String> myMap = new HashMap<>();
        List<String> mm = new ArrayList<>();
        for(int i = 0 ; i < 11; i ++){
            myMap.put(f.name().lastName(),f.name().firstName());
        }
        System.out.println(myMap);
        myMap.forEach((key,value) -> {if(key.startsWith("M")){
            mm.add(value);
        }});
        System.out.println(mm);




        List<String> newList = new ArrayList<>();
        for(int i = 0;i< 15;i++){
            newList.add(f.name().firstName());
        }
        System.out.println();
        newList.sort((x,y) -> x.length() - y.length());
        System.out.println("Sort method used With Lambda " + newList);

        System.out.println();


        System.out.println(f.chuckNorris().fact());
        System.out.println(ls);
        ls.removeIf(x -> !x.startsWith("A"));
        // 1.) declare a variable
        // 2. ->
        //code you want to be called for each element
        System.out.println(ls);

    }
      public static void m1 (List<String> ls) {
          ls.forEach(x -> {  //System.out.println(x + " "))
              if (x.startsWith("A")) {
                  System.out.println(x);
              }
          });
      }
}
