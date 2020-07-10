package sessions.Methods;

import java.util.Scanner;

public class SleepInWithMethod {


    public static void main(String[] args) {
        //Create an object of a class in which the method is declared in.
        SleepInWithMethod sleep = new SleepInWithMethod();
        sleep.printSleepInOrNot(true,false);
        sleep.printSleepInOrNot(false, false);
        sleep.printSleepInOrNot(false, true);
    }


    public void printSleepInOrNot(boolean isVacation, boolean isWeekday) {

        if (isVacation || !isWeekday) {
            System.out.println("Sleep well");
        }
        else {
            System.out.println("Stay up and hungry");
        }
    }
}



