package sessions.wrappers;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class WrappersDemo1 {
    public static void main(String[] args) {
        //this is what you use usually.
        int num = 0;
        //Wrapper class using autoboxing
        Integer numWrapped = 0;
        Integer numWrapped2 = new Integer(0);//regular way, but redundant
        Integer num2Wrapped = 124;
        System.out.println(numWrapped * num2Wrapped);
        List<Integer> numsList = new ArrayList<>();
        numsList.add(12);
        numsList.add(14);
        int value1 = numsList.get(0); //Unboxing
        for (int number : numsList) {
           System.out.println(number/2);
        }
        Set<Double> pricesSet = new HashSet<>();
        //This will be seen once in a while.
        String currentYear = "2020";
        String dob = "1982";
        //int age = currentYear - dob;
        System.out.println(currentYear + " as a String");
        //Wrapper classes provide methods that can covert String format to int,double etc.
        //converting from String to primitive data types is called parsing.
        //parseInt(String s);
        //parseInt(String s, int radix)
        int year = Integer.parseInt(currentYear);
        System.out.println(year + " as an int");
        //int dobInt = Integer.parseInt(dob);
        int dobInt = Integer.parseInt("1982");
        int age = year - dobInt;
        System.out.println(age);
        //Wrapper class.toString(int i)
        //convert from int to Sting data type so that I can perform string manipulation
        int id = 65;
        String idStr = Integer.toString(id);
        System.out.println(idStr);
        int ssn = 123345679;
        StringBuilder ssnStr = new StringBuilder(Integer.toString(ssn));
        ssnStr.insert(3,"-");
        ssnStr.insert(6,"-");
        System.out.println(ssnStr);
        
    }
}
