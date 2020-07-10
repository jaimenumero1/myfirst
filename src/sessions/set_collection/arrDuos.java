package sessions.set_collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
public class arrDuos {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0; i < 90_000; i ++){
            ls.add(i);
            ls.add(i);
        }
        long t1 = System.currentTimeMillis();
        removeDups(ls);
        long t2 = System.currentTimeMillis();
        removeDups3(ls);
        long t3 = System.currentTimeMillis();
        new HashSet<>(ls);
        long t4 = System.currentTimeMillis();
        System.out.println("With new Arr using contains: " + (t2-t1)
        + " Using Stream: " + (t3 - t2)
        + " Creating hashSet: " + (t4 - t3));
    }
    // 1 (index: 0; lastIndex:5) ind:3
    // 2,  7,  3, 1, 4    (3, 3)
    // 1, 2, 3, 4
    public static List<Integer> removeDups(List<Integer> ls){
        List<Integer> res = new ArrayList<>();
        for(int i : ls){
            if(!res.contains(i)) res.add(i);
        }
        return res;
    }
    public static void removeDups2(ArrayList<Integer> ls){
        for(int i = 0; i < ls.size(); i++){
            int current = ls.get(i);
            if(ls.indexOf(current) != ls.lastIndexOf(current)) ls.remove(i--);
        }
    }
    public static ArrayList<Integer> removeDups3(ArrayList<Integer> ls){
         return new ArrayList<>(ls.stream().distinct().collect(Collectors.toList()));
    }
}