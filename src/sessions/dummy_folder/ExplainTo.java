package sessions.dummy_folder;

public class ExplainTo {
// Remove all the so so sos
    // Replace with Super
    // hint Create 2 strings and add them to the String Super


    public static void main(String[] args) {

        String gPrgramers = "We are so so so so so programmers!!!!!!!!!";
        String super1 = "Super";
        int whereIsSo = gPrgramers.indexOf("so");
        System.out.println(whereIsSo);
        int whereIsLastSo = gPrgramers.lastIndexOf("so");
        System.out.println(whereIsLastSo);

        String weAre = gPrgramers.substring(0,7);

        String programmers = gPrgramers.substring(21);

        System.out.println("Great Job Guys!!!!   " + weAre + super1 + programmers);





    }

}
