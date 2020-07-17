package read_code;

import java.util.HashSet;

public class Challenge {
    public static int xxx(String str){
        HashSet set = new HashSet();
        HashSet uniques = new HashSet();

        for (char c:str.toCharArray()) {
            if(!set.contains(c)){
                set.add(c);
            }else {uniques.add(c);}
        }
        return uniques.size();
    }

    public static void main(String[] args) {
        System.out.println(xxx("aabbcde"));
    }
}
