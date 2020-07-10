package sessions.Methods;

public class Diff {

     static void staticMethod1 (){
        String helloMusk = "Hello!";
         System.out.println(helloMusk);; }





    public static void main(String[] args) {
        Diff diff = new Diff();

        int methodResult = diff.diff21(40);
        System.out.println(methodResult);

        //null -> null is a value which represents emptiness.
        // null -> 0, false, 0.0;
        //String str = null;
        //all non primitive data types can be assigned to null;

        int x = (int)9.0;  //explicit casting


        diff.methodG(3);
        diff.methodB(2);

    }

    public int diff21(int n) {  //instance method(non-static)

        if (n <= 21) {
            return   21 - n;
        } else {
            return   (n - 21) * 2;
        }

    }

    //  3
    public void methodG(int num){
        System.out.println("Method just started");

        if(num < 5){
            System.out.println("Num is less than 5");
        }
        else {
            System.out.println("Num is more than or equal to 5");
        }

        System.out.println("Method executed completely."); //compile time error
    }


    public static void methodB(int num){
        System.out.println("Method just started");

        if(num < 5){
            System.out.println("Num is less than 5");
        }
        else {
            System.out.println("Num is more than or equal to 5");
        }

        System.out.println("Method executed completely."); //compile time error
    }



}
