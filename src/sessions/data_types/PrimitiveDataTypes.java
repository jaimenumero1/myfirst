package sessions.data_types;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
    /* data type
    byte age = 77;
    System.out.println(age);
    //To display my date of birth. in mm/dd/yyyy
    //variable its name for container.
        // one variable will have one data type, and value.
        byte month = 7;
    byte day = 24;
    int year = 1994;
    System.out.print(month);
    System.out.print("/");
    System.out.print(day);
    System.out.print("/");
    System.out.println(year);
    //for whole numbers


    //is most widely used data for whole numbers
        int usaPopulation = 350000000;
        System.out.println(usaPopulation);

        //cannot store it in int bc out of bound(range). we have to
        //put L at the end when the number bigger than the int range.
        // because java assumes everything is int.

        long worldPopulation = 8000000000l;
        System.out.println(worldPopulation);

                double gasPrice = 2.99999;
        System.out.println("Gas Price for on gallon in Chicago: $"+gasPrice);

boolean isJavaFun = true; //yes
boolean isFishTasty = false;

System.out.println("I?"+ isJavaFun);*/


        //byte => data type;
        //age ==> variable.
        //name of my container.
        byte age = 78;

        byte weight = 120;

        byte height = 110;

        byte numberOfStudent = 50;

        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(numberOfStudent);
        System.out.println(age);


        //To display my date of birth. in mm/dd/yyyy
        //variable it's name for a container.
        //one variable will have one data type, and value.
        byte month = 2;
        byte day = 15;
        short year = 1992;

        System.out.print(month);
        System.out.print("/");
        System.out.print(day);
        System.out.print("/");
        System.out.println(year);

        //is most widely used data type for whole numbers.
        int usaPopulation = 350000000;
        System.out.println(usaPopulation);

        //cannot store it in int bc out of bound(range). we have to put l at the end when the number is
        //bigger than the int range.
        long worldPopulation = 8000000000l;
        System.out.println(worldPopulation);

        int viewOfYoutubeVideo = 2000000000;
        System.out.println(viewOfYoutubeVideo);

        long gangamStyleYoutubeViews = 3500000000l;
        System.out.println(gangamStyleYoutubeViews);


        System.out.print(month);
        System.out.print("/");
        System.out.print(day);
        System.out.print("/");
        System.out.print(year);
        System.out.println(" -- This is American Standard");

        System.out.println();

        System.out.print(day);
        System.out.print("/");
        System.out.print(month);
        System.out.print("/");
        System.out.print(year);
        System.out.println(" -- This is European Standard");


        byte temperatureInFarenheit = -13;
        System.out.print("Temperature right now: ");
        System.out.print(temperatureInFarenheit);
        System.out.println("F");

        System.out.println();

        double versionOfJava = 1.8;              // 15 decimal points.
        float hourlySalary = 60.50123123121233f; // will hold only 6 decimal points.


        System.out.print("Java version I am using to build my program: ");
        System.out.println(versionOfJava);
        System.out.println("Currently I am making " + hourlySalary);
        System.out.print("Currently I am making ");
        System.out.println(hourlySalary);

        double gasPrice = 3.111;
        System.out.println("Gas Price for one gallon in Chicago: $" + gasPrice);


        boolean isJavaFun = true; // yes
        boolean isFishTasty = false; //no

        System.out.println("Is Java Fun Fun Fun? " + isJavaFun);
        System.out.println("Is Fish tasty? " + isFishTasty);


        boolean amIFrench = false;
        boolean isDevXSchoolBest = true;

        System.out.println("Do you think I am French? " + amIFrench);
        System.out.println("Is DevX School the best? " + isDevXSchoolBest);


        boolean isGasExpensive = true;

        System.out.println("Is Gas Price in Chicago high? " + isGasExpensive + " the current price: " + gasPrice);


        char gender = 'F';//'M'

        char dolloarSign = '$';

        char ampersand = '&';

        char neutural = 'N';

        char reverse = 'R';

        char drive = 'D';


        System.out.println("What is your gender? " + gender);
        System.out.println("Which currency are you using? " + dolloarSign);
        System.out.println("What is Ampersand sign? " + ampersand);


        String schoolName = "DevX School";
        String psySongName = "PSY - Gangam Style";
        String songNameSuffix = "M/V";

        System.out.println(psySongName + " " + songNameSuffix);

        System.out.println(schoolName);

        String carModel = "Camry";
        String carMake = "Toyota";
        int carPrice = 13000;
        int miles = 220000;
        boolean willIGoDown = false;
        System.out.println(carMake + " " + carModel + " for $" + carPrice + " miles: " + miles + " Is negotiable? " + willIGoDown);
    }
}