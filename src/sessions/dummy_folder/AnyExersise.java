package sessions.dummy_folder;

public class AnyExersise {
    public static void main(String[] args) {

        String message = " We are so so so Programmers!!!!!!!";
        String super1 = "Super";

        // Create 2 strings
        // take out so so sos and Add Super
        int message1 = message.indexOf("so");
        System.out.println(message1);

        String  firstPart = message.substring(0,message1);
        int lastSo = message.lastIndexOf("so");
        String secondPart = message.substring(lastSo+2);
        System.out.println(lastSo);
        String everything = firstPart+super1+secondPart;
        System.out.println(everything);



    }

}
