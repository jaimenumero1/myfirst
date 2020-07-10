package sessions.Array_List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_Practice {
    public static void main(String[] args) {
        String [] names = new String[6];
        names[0] = "James";
        names[1] = "Askar";
        names[2] = "Sorin";
        names[3] = "Mike";
        System.out.println(Arrays.asList(names));
        List<String> namesList = Arrays.asList(names);
       // namesList.add("Antonio"); cannot add because we started with an Array which size not changeable but
        // we cannot add  or replace or remove but we can use contains, size
        System.out.println(namesList);
        // if you call add or remove methods program will throw unsupported exceptions
        // to be able to convert it // in case you want to manipulate it you can create another list
        // by passing the converted list, to the new list parameter
        List<String> names2 = new ArrayList<>(namesList);
        names2.add("Tyler");
        names2.add("Izak");
        names2.add("Andrew");
        System.out.println(names2);
        names2.set(4,"Charles");
        names2.set(5,"Bertha");
        System.out.println(names2);

    }
}
