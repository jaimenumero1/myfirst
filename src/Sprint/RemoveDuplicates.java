package Sprint;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    //    Write a Program to remove duplicates from array:
//
//    You have given an array which contains duplicates, could be one or more.
//    You need to write a program to remove all duplicates from array in Java.
//    For example if given array is {1, 2, 1, 2, 3, 4, 5} then your program
//    should return an array which contains just {1, 2, 3, 4, 5}.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Set<Integer> remDuplicates = new HashSet<Integer>();
            System.out.println("I will create an Array for you with out Duplicates");
            System.out.println("First you will need to enter size of array -->");
            int arrSize = input.nextInt();
            System.out.println("No worries we will remove any Duplicates for you!!");
            int [] numArr = new int[arrSize];
            String userInput = "";
            int index = 0;
            int userIndex = 1;
            do {
                System.out.println("Please enter " + userIndex + "st number");
                int userINum = input.nextInt();
                userIndex++;
                numArr[index] = userINum;


//                  System.out.println("Would you like to enter another Number? enter y/n for Yes/NO ");
//                userInput = input.next();
//                userInput.toLowerCase();

//                while(!(userInput).equals("y") && !(userInput).equals("n")){
//                    System.out.println("Would you like to enter another Number? enter y/n for Yes/NO ");
//                    userInput = input.next();
//                    userInput.toLowerCase();
//                }

//                input.nextLine();
                index++;
            }while(index<numArr.length);

            //System.out.println(Arrays.toString(numArr));
            for(Integer n : numArr){
              remDuplicates.add(n);
            }
            System.out.println("The list you entered without duplicates is: " + remDuplicates);

        }catch(Exception e){
            System.err.println("Error, Program will now Terminate");
            System.err.println("Please rerun Program and Enter a valid input");
          //  System.err.println("Remember size of list,must be smaller, or less than U initially Suggested");

        }
    }
}