package sessions.Methods;

public class TimeMethods {

////convert minutes to day, hrs, minutes
//    // to get days from minutes -->
//    //get the minutes -> minutes % 60.
//
//        public void convertMinutesToDaysHrsMinutes (int minutes){
//          //  String daysHrsMinutes = minutes/24/60 + "days" + minutes/
//        }
//

        public static void main(String[] args) {
                TimeMethods tm = new TimeMethods();
                tm.convertMinutesToDaysHrsMinutes(12333);

                int days = tm.convertMinutesToDays(-233312333);
                System.out.println(days + " days");

                System.out.println(tm.convertMinutesToDays(12333));  // Methods can be called in other methods parameters only if they return a value. and the return types match.
        }

        //convert minutes to days, hrs, minutes
        //to get days from minutes -> minutes/24/60
        //to get hours from minutes -> minutes/60%24
        //get the minutes - > minutes%60.

        //in if statement we put a boolean
        public void convertMinutesToDaysHrsMinutes(int minutes) {
                if (isValidInput(minutes)) {
                        String daysHrsMinutes = convertMinutesToDays(minutes) + " days "
                                + convertMinutesToHours(minutes) + " hours "
                                + getTheRemainingMinutes(minutes) + " minutes";
                        System.out.println(daysHrsMinutes);
                } else {
                        System.out.println("Not an acceptable value.");
                }
        }

        //convert minutes to days
        //give the days from minutes
        public int convertMinutesToDays(int minutes) {
                if (isValidInput(minutes)) {
                        return minutes / 24 / 60;
                } else {
                        return -1;  //wrong result
                }
        }

        public int convertMinutesToHours(int minutes) {
                if (isValidInput(minutes)) {
                        return minutes / 60 % 24;
                } else {
                        return -1;
                }
        }

        public int getTheRemainingMinutes(int minutes) {
                if (isValidInput(minutes)) {
                        return minutes % 60;
                } else {
                        return -1;
                }
        }

        public boolean isValidInput(int minutes) {
                return minutes > 0;
        }

}
