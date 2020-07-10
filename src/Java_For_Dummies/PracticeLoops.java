package Java_For_Dummies;

public class PracticeLoops {
     public static void main(String[] args) throws InterruptedException {

        int index1 = 0;
        int count = 0;

        String str = "Cool Scholllol Cooler";
                // This index1 is 0, and str.length gives you total length of string
                    //18
        while (index1 < str.length()) {

            if (str.charAt(index1) == 'l') {
                      count++; //2

            }
            Thread.sleep(111);
            index1++;

        }
       System.out.println("Occurance of o  is: " +count );

    }

}
