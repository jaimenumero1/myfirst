package read_code;

public class recursionExample2 {

    public static void main(String[] args) {

        //factorial of 5 is 5*4*3*2*1
        //this is factorial by standard loop

        int change = 5;

        for(int i = 1; i < 5;i++){
            change = change * i;
        }
        System.out.println("The result is : " + change);
        System.out.println("This is the result : " + factorial(1) );
    }

    public static int factorial(int n){
        if(n == 5)
            return n;
        return n * factorial(n+1);
    }

}
