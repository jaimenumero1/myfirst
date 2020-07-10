package sessions.StringMethods;



import java.util.Scanner;
public class Contains {
    //Contains method returns boolean
    //public boolean contains(String str) -> it will return true
    //if the String contains str.
    public static void main(String[] args) {
        String devx = "DevX School Coding Bootcamp";
        String stanford = "Stanford University";
        String harvard = "Harvard University";
        //Have to match every single character
        boolean isCodingBootcamp = devx.contains("Coding Bootcamp");
        System.out.println(isCodingBootcamp);
        boolean isCodingBootcamp2 = stanford.contains("Coding Bootcamp");
        System.out.println(isCodingBootcamp2);
        //Contains method is largely used in pre validations.
        //Imagine you need to check for Dog or Cat Breeds
        String dogOrCat = "Cat Breed: Garfield";
        if (dogOrCat.contains("Cat")) {
            System.out.println("Bring it to Cat vets");
        } else if (dogOrCat.contains("Dog")) {
            System.out.println("Bring it to Dog vets");
        } else {
            System.out.println("invalid input");
        }
        //
        String paymentInfoFromTheUser = "Name: John Doe, address: 123 main st, ..etc";
        if (paymentInfoFromTheUser.contains("Credit Card")) {
            //validate all info
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number");
        String str = sc.nextLine();
        System.out.println(str);
        //Regex -- Regular Expressions
        String str1 = "Hello";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        int indexOfMiddle = str1.length() / 2;
        System.out.println(indexOfMiddle);
        String newString = str1.substring(0, indexOfMiddle) + str1.substring(indexOfMiddle, indexOfMiddle + 1).toUpperCase() + str1.substring(indexOfMiddle + 1);
        System.out.println(newString);
        //deletes all spaces before and after the string
        String str3 = "   yes   ";
        boolean isYes = str3.equalsIgnoreCase("yes");
        System.out.println(isYes);
        str3 = str3.trim();
        isYes = str3.equals("yes");
        System.out.println(isYes);
        //only spaces after and before the words are trimmed, middle spaces are not touched.
        String str5 = " True Answer  ";
        str5 = str5.trim();
        boolean trimmed = str5.equals("True Answer");
        System.out.println(trimmed);
    }
}
