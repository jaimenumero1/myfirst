package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class homework {


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.##");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a word ");

        String userInput = sc.nextLine();
        userInput.toLowerCase();

        int count = 0;
        int countDigits = 0;

        for (int i = 0; i < userInput.length() ; i++) {
            if(userInput.charAt(i) == 'o' || userInput.charAt(i)== 'a'|| userInput.charAt(i) == 'e' ||
            userInput.charAt(i) == 'i' || userInput.charAt(i) == 'u'){
                count++;
            }
            if(Character.isDigit(userInput.charAt(i))){
                countDigits++;
            }
        }
        double percentage = (double)count/userInput.length() * 100.00;

        System.out.println("Number of vowels: " + count + " (" + df.format(percentage) + "%)"  );
        System.out.println("Number of Digits is: " + countDigits + " (" + df.format((double)countDigits/userInput.length()*100)+"%)");
    }


}
