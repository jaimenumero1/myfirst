package sessions.Methods;

public class Calculator {

    // please write a function (method)
    //which will add 2 numbers
    public void sum(int num1, int num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        int sum2 = myCalculator.addTwoNum(3,2);
        System.out.println("sum is: " +sum2);


        //42
        int result = myCalculator.addTwoNum(30, 12); //returning a result which is int
        System.out.println(result);
        //60
        int result1 = myCalculator.addTwoNum(40, 20);
        System.out.println(result1);
        //42     60
        int finalResult = myCalculator.addTwoNum(result, result1);
        System.out.println(finalResult);

        int taxToBePaid = myCalculator.calculateTax(100000, true);
        System.out.println(taxToBePaid);

        int taxToBePaidForUnmarried = myCalculator.calculateTax(100000, false);
        System.out.println(taxToBePaidForUnmarried);

        char examGrade = myCalculator.getGrade(88.2);


        //start from somewhere with the initial values
        //pass on the results of the methods to other methods.
        // keep doing that until you reach the final result of the program.
    }


        //please write a function(method
        //which will add two numbers

         // int is a return type.
            // return type means result of the function
                    //30
            //return type  means data type of the result of the method
    public int addTwoNum(int num1, int num2){
        return num1+num2;
    }
        //signals the give this result. Or this is the result of the function.

//execute(run) the logic and return the result.
    // add num1 to num2
    //return type of of method doesnt affect the params.

    public int calculateTax(int salary, boolean isMarried) {
        int tax = 0;
        if (isMarried) {
            tax = salary * 5 / 100;
        } else {
            tax = salary * 30 / 100;
        }

        return tax;
    }

    //write a method which will give(returns) me exam grade based on the exam score
    //
    public char getGrade(double examScore) {

        char grade;
        if (examScore >= 60 && examScore < 70) {
            grade = 'D';
        } else if (examScore >= 70 && examScore < 80) {
            grade = 'C';
        } else if (examScore >= 80 && examScore < 90) {
            grade = 'B';
        } else if (examScore >= 90 && examScore < 100) {
            grade = 'A';
        } else {
            grade = '0';
        }

        return grade;
    }
}
