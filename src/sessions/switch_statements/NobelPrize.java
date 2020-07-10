package sessions.switch_statements;

import java.util.Scanner;

public class NobelPrize {

    public static void main(String[] args){
        //Write a program which will tell me if I qualify
        //for a Nobel Prize

        //ONE QUALIFIES for nobel prize when
        // doesSignificantWork
        // is nobelPrize candidate

        //ask the user did you do significant work?
        //did you makesBreakthrough?

        //TO be a candidate for a nobel prize I have to
        //do significant work and make break through

        Scanner input = new Scanner(System.in);

        System.out.println("did you do significant work?");
        boolean doesSignificantWork = input.nextBoolean();

        System.out.println("did you a make Breakthrough");
        boolean makesBreakthrough = input.nextBoolean();


        boolean nobelPrizeCandidate = false;
        //1>2 0==0 "word".equals("word)

        if(doesSignificantWork && makesBreakthrough) {
            nobelPrizeCandidate = true;
        }

        System.out.println("Is the user a nobel prize candidate? " + nobelPrizeCandidate);

        //if user is a candidate then wish a good luck
        //otherwise wish to keep chasing his/her goal
        if(nobelPrizeCandidate) {
            System.out.println("Good Luck");
        }
        else {
            System.out.println("Keep chasing your goal");

        }
        }
}
