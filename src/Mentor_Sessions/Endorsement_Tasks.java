package Mentor_Sessions;

public class Endorsement_Tasks {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(amazonTask2("Who arrrrrrrre weeee who/"));
        // How many times is a letter reapeated?             last e is 20
    }
        public static String amazonTask2(String s){
            String res = "";
            for(int i = 0; i < s.length(); i++){
                int counter = 1;
                char curr = s.charAt(i);
                int index = i + 1;
                while( index < s.length() && s.charAt(index) == curr) {
                    counter++;
                    index++;
                }
                if(counter > 1) {
                    res += "" + counter + curr;
                    i += counter-1;
                }
                else res = res + curr;
            }
            return res;
        }
    }
