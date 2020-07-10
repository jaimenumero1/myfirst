package Java_For_Dummies;

public class useAddTwoNumClass {

    public static void main(String[] args) {

        MethodPractice input = new MethodPractice();
        input.addTwoNum(8,9);
        int sum = input.addTwoNum(9,9);
        System.out.println(sum);
        int sum2 = input.addTwoNum(88, 99);
        System.out.println(sum2);


    }
}
