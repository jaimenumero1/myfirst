package homeworks;

public class FourdifferentMethods {
    public int add2Nums (int a, int b){
       return a + b; }
   public long subtract (long a , long b){
       return a - b ;
   }
   public double multiplyTwoNumbers (double a, double b){
       return a * b;
   }
   public float divideTwoNumbers (float a, float b)
   {return a / b;
   }
   public static void main(String[] args) {
       int a1 = 21;
       int b2 = 3;
       FourdifferentMethods calculate = new FourdifferentMethods();

       long subtractedResult = calculate.subtract(a1,b2);
        System.out.println(subtractedResult);

        int addCalculator = calculate.add2Nums(a1,b2);
        System.out.println(addCalculator);

        double mult = calculate.multiplyTwoNumbers(a1,b2);
        System.out.println(mult);

        float divideN = calculate.divideTwoNumbers(a1,b2);
        System.out.println(divideN);


    }
}
