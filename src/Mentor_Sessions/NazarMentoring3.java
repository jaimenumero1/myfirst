package Mentor_Sessions;

import java.sql.SQLOutput;

public class NazarMentoring3 {
    public static void main(String[] args) {
        System.out.println();

        int seconds = 864_000;
        //86400 seconds in one day. 3600 seconds in one hour.

        int days = seconds/86400;
        System.out.println(seconds/3600);

        seconds = 4567899;

        seconds %= 3600;
        System.out.println("this one " + seconds);

        System.out.println(seconds);
        System.out.println();
        System.out.println(days);

        int hours = seconds/3600;

        System.out.println(hours);

        seconds %= 3600;// 3600 seconds in one hour
        System.out.println(seconds);

        int minutes = seconds/60;
        seconds %= 60;

        System.out.println(minutes);// seconds was changed in line 13 to 0 by modular= action
        //seconds was changed again in line 19 to 0 again this is why we get a result of zero
        //modular is the result of dividing and then using only the remainder

        System.out.println(days + hours + ":" + minutes + ":" + seconds);







    }
}
