package sessions.Methods;

public class MyOwnMath {

    public static void main(String[] args) {
        //5
        //Math.pow(5,2);
        // Scanner keyboard = new Scanner(System.in);

        MyOwnMath math = new MyOwnMath();
        math.square(5);
        math.pow(5,4);
    }

    public void square(int num){
        System.out.println(num*num);
    }

    public void pow(int baseNum, int powNum) {
        System.out.println(Math.pow(baseNum,powNum));
    }
}




