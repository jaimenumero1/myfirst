package Mentor_Sessions;

public class NazarMentoring {
    public static void main(String[] args) {
//            int seconds = 300;
//            System.out.println("How many minutes ad seconds left ");
        System.out.println(NazarMentoring.amazonTask("Amaaazojijijiii"));
    }

    public static String amazonTask(String s) {
        if (s.isEmpty()) return s;
        String res = ""; //Declare a container the will store the result and return it
        char compare = s.charAt(0); // Take the first char to start the comparison
        int counter = 1; // Counter to count occurrences
        for (int i = 1; i <= s.length(); i++) {
            char curr = compare;
            if (i != s.length()) {
                curr = s.charAt(i); // Current char that will be updated with each iteration
            }
            if (i < s.length() && curr == compare)
                counter++; // If current characters is the same as the one we stored, just count icounter++;
            else {   // if the current char is not the same as the one we were storing
                if (counter > 1)
                    res += "" + counter + compare;// if we had more than 1 occur than store number of occur and the char
                else res += compare;// if it was only 1 occur then just store the character
                counter = 1;// since chars are not equal we need to update the counter to start counting new char
                if (i < s.length())
                    compare = s.charAt(i);//updating the compare to new char since chars are not equal
            }
        }
        return res;

    }
}
