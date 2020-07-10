package Mentor_homeworks;

import java.util.Scanner;

public class MentorHomeworkTimeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Total seconds: ");

        int hours, minutes, remainingSeconds, allSeconds, seconds2;


        allSeconds = input.nextInt(); // 8000

        hours = allSeconds / 3600; // 8000 / 3600 = 2 hours remainingSeconds

        System.out.println(allSeconds + " seconds converted in to:");

        System.out.println(hours + " hours");

        remainingSeconds = allSeconds % 3600; // TAke out hours and see (min + sec)!!
        //8000 / 3600 = 2Hours + remainingSeconds(800seconds).

        minutes = remainingSeconds / 60;  // 800seconds / 60seconds = 13 minutes + remainingSeconds.

        System.out.println(minutes + " minutes");

        seconds2 = remainingSeconds % 60; // Take out minutes and see secconds!! 800 / 60 = 13 min + 20 sec.

        System.out.println(seconds2 + " seconds");
        // 8000/3600 = 2 hours + 800 sec.
        // 800sec/60sec = 13 min + 20 sec.
        // 8000 = 2 hours +  13 minutes + seconds
    }
}
