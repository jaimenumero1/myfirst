package homeworks;

import javax.crypto.spec.PSource;
import java.util.*;

public class Generics <generics>{

    public static void main(String[] args) {
  Set<String> newList;

  if(true){
      newList=new LinkedHashSet<>();
      newList.add("a");
      newList.add("z");
      newList.add("c");
  }
  else {
      newList = new TreeSet<>();
      newList.add("a");
      newList.add("z");
      newList.add("b");
      newList.add("f");
  }

        System.out.println(newList);
    }



}
