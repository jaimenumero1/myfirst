package homeworks;

public class LearnLoopsWithK {

    public static void main(String[] args) {
        // find how many a's in the String;

        String str = "This fallaaaaaa we start Class in campus";
        int totalAs = 0;
        int loop = 0;
                        //loop is 0 at start and Length of String is 33
        while (loop < str.length()){
                        // this int underneath here needs to be
            // changing so the character being checked is different
            if (str.charAt(loop) == 'a'){
                totalAs++;
            }
            loop++;

        }
        System.out.println("The occurance of a's is:" + totalAs);
    }
}
