package sessions.operators.comparison;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ComparisonOperator {

    public static void main(String[] args) {

        int ageLimit = 60;
        int userAge = 65;        // 65                   60
        // is userAge more than ageLimit
        System.out.println("Is user a senior? " + (userAge >= ageLimit));

        double priceOfACake = 7.99;
        double priceOfTheJuice = 7.99;                        // is 7.99 equals to 7.99
        System.out.println("Are the two item prices equal? " + (priceOfACake == priceOfTheJuice));

        double priceOfTheOnePoundOfApple = 1.99;
        // is apples same price of cake      false
        System.out.println("Are apples and cake the same price ?" + (priceOfACake == priceOfTheOnePoundOfApple));

        double dime = 0.10;
        double userInput = 0.50;
        System.out.println("Is user giving me a dime? " + (dime == userInput));

        double evilNum = 666;
        double userInput1 = 100;                                // is 666 not equals to 666.=> false.
        System.out.println("Is the user input a valid number " + (evilNum != userInput));

        int weekend = 7;
        int today = 1;                              // do I work today? 1 != 7 => today ==1 or today == 2
        //today== 3 today == 4 today == 5 if not for thi == we would have to code all this
        System.out.println("do you work today ?" + (today != weekend));

        int lotteryWinnerNumber = 123456;

        int usersLotteryNumber = 134456;
        //simplify
        boolean isKeepPlaying = lotteryWinnerNumber == usersLotteryNumber;
        boolean isWinner = lotteryWinnerNumber != usersLotteryNumber;

        System.out.println("Should I keep playing?" + isKeepPlaying);

        System.out.println("Did I win? " + isKeepPlaying);

        double minimumGasAmount = 1 / 4;
        double carCurrentGasAmount = 1 / 2;

        boolean turnOn = carCurrentGasAmount < minimumGasAmount;
        System.out.println("is gas light on? " + turnOn);
        System.out.println("Should the gas light be on? " + turnOn);

        char male = 'M';
        char userGender = 'F';
        char requirement = 'F';

        boolean shouldBeRevised = requirement == userGender;
        System.out.println("should the applicant be reviewed ?" + shouldBeRevised);

        int requiredYearsOfExperience = 4;
        int userExperienceYears = 2;

        boolean isExperienced = userExperienceYears > requiredYearsOfExperience;
        System.out.println(isExperienced);


        String whatTheChildWants = "Lollipop";
        String whatTheParentsBought = "Chocolate";

        boolean isHappy = whatTheChildWants == whatTheParentsBought;
        Boolean isCrying = whatTheChildWants != whatTheParentsBought;


        System.out.println("Is the baby happy? " + isHappy);
        System.out.println("Is the baby Crying? " + isCrying);

        //Do I strudy online

        String whenCovideDone = "May";
        String currentMonth = "April";
        boolean canIGoToCampus = whenCovideDone == currentMonth;
        boolean doIStudyOnline = whenCovideDone != currentMonth;

        System.out.println(canIGoToCampus);
        System.out.println(doIStudyOnline);


        //Should I give a discount
        // movie theater
        //teenagers age less than 20
        //seniors age more than > 60

        int userGivenAge = 18;
        //TRUE                // FALSE
        boolean isDicount = (userGivenAge < 20) || (userGivenAge >= 60);
        System.out.println("Give discount    " + isDicount);

        boolean isDisco = userAge < 20;
        boolean isDisco2 = userAge >= 60;

        System.out.println("Give discount?   " + isDicount);

        System.out.println("Give discount? " + isDisco2);
        //Passed the driving exam
        int passingWritenTestScore = 70;
        int drivingTestScore = 6;
        int userWrittenTestScore = 76;
        int userDrivingTestScore = 5;
        boolean isPassed = userWrittenTestScore >= passingWritenTestScore && userDrivingTestScore >= drivingTestScore;
        System.out.println("Did I pass DL exam? " + isPassed);


    }
}
