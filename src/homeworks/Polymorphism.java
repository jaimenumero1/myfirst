package homeworks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Polymorphism {
    public static void main(String[] args) {

        Set<String> newSet;
        int i = 3;


        if(i ==1){
            newSet = new HashSet<>();
            newSet.add("z");
            newSet.add("w");
            newSet.add("x");
        }
        else if(i==2){
            newSet= new LinkedHashSet<>();
            newSet.add("z");
            newSet.add("w");
            newSet.add("x");
        }else{
            newSet = new TreeSet<>();
            newSet.add("z");
            newSet.add("w");
            newSet.add("x");
        }

        System.out.println(newSet);
    }
}
