package Mentor_Sessions;

public class TestBMI {
    public static void main(String[] args) {
        BMI obj1 = new BMI("Sofia", 51,1.71);
        System.out.println(obj1.getBMI());
        System.out.println(obj1.getStatus());

        obj1.weight = 72;
        System.out.println(obj1.getBMI());
        System.out.println(obj1.getStatus());

    }
}
