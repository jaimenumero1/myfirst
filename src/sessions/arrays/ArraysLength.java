package sessions.arrays;

public class ArraysLength {
    //store the salaries of 10 employees
    //100000
    //95000
    //120000
    //99000
    //100000
    //97000
    //105000
    //115000
    public static void main(String[] args) {
        int[] salaries = new int[10];
        //We cannot go out array bound with the this approach in the initialization
        //sum of all number
        //sum/10(salaryArr.length)
        int[] salaryArr = {100_000, 95000, 120000, 99000, 100000, 97000, 105000, 115000, 102000, 107000};
        String[] week = new String[7];
        week[0] = "Monday";
        week[1] = "Tuesday";
        week[2] = "Wednesday";
        week[3] = "Thursday";
        week[4] = "Friday";
        week[5] = "Saturday";
        week[6] = "Sunday";
//        System.out.println(salaryArr[0]);
//        System.out.println(salaryArr[1]);
//        System.out.println(salaryArr[2]);
//        System.out.println(salaryArr[3]);
//        System.out.println(salaryArr[4]);
//        System.out.println(salaryArr[5]);
//        System.out.println(salaryArr[6]);
//        System.out.println(salaryArr[7]);
//        System.out.println(salaryArr[8]);
//        System.out.println(salaryArr[9]);
        System.out.println();
        System.out.println("Length of salaryArr " + salaryArr.length);
        for (int i = 0; i < salaryArr.length; i++) {
            System.out.print(i+ " ");
            System.out.println(salaryArr[i]);
        }
        int total=0;
        for (int i =0; i < salaryArr.length; i++) {
            total += salaryArr[i]; //total = total + salaryArr[i]
        }
        System.out.println("Total: " + total);
        int averageSalary = total/salaryArr.length;
        System.out.println("average salary: " + averageSalary);
        //Size of the array - salaryArr.length;
        //Tell me if day is a week day
        //based on the values of weekDays array
        //arr.length --> gives as the size of the array an int value
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String day = "Monday";
        boolean isWeekday = false;
        for (int i = 0; i < weekDays.length; i++) {
            if (day.equalsIgnoreCase(weekDays[i])) {   //when we are comparing String with String
                isWeekday = true;
            }
        }
        System.out.println("Is " + day + " a weekday? " + isWeekday);
        //== -> it compares the object locations in the memory
        
    }
}
