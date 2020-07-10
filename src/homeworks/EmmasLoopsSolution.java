package homeworks;

public class EmmasLoopsSolution {
    public static void main(String[] args) {

        String str = "Coooooool School Cooler ";
        char letterO = 'o';
        int count = 0;


        for (int i = 0; i <str.length(); i++){
            if (str.charAt(i) == letterO){
                count++;
            }
        }
        System.out.println("Number of occurances of letter 'o' is : " + count);
    }
}
