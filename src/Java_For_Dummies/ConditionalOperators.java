package Java_For_Dummies;

public class ConditionalOperators {
    public static void main(String[] args) {

        //conditional operators == if else statements

        int a = 0;
        int age= 44 ;
        System.out.println(age < 49 ? "You are Young": "Yoy are old");

         a  = ( age < 55 ) ? 9 : 7;
        System.out.println(a);


        int max = 0;
        int b = 8;

//        if (a > b) { max = a;}
//        else { max = b; }
//        instead of this, this
        max = (a > b) ? a : b ;

        System.out.println(max);


        System.out.println(Math.ceil(5.5));

        System.out.println(Math.floor(8.8));
    }


}
