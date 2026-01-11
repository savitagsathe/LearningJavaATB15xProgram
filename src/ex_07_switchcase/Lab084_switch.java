package ex_07_switchcase;

import java.util.Scanner;

public class Lab084_switch {
    /**
     * Problem
     * // You need to take a user input and ask for the integer from 1 to 7.
     * // And if user enters 1 to 7, 1- Mon,
     * // you will tell which day it is.
     * // Logic Building Formula
     * // Step 1 - Number one is using the Scanner class.
     * // Step 2 number two will be basically figuring out the expression and the day.
     * // Step 3- We will basically add step 3 as a rough logic.
     * // Step 4 - 4 is you will write the fix the logic and optimize.
     * // Step 5 - figure out the edge cases.
     **/


    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the 1 to 7 number to print the day");
        if (s.hasNextInt()) {
            int day = s.nextInt();

            switch (day) {
                case 1:
                    System.out.println("mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thu");
                    break;

                case 5:
                    System.out.println("Fri");
                    break;

                case 6:
                    System.out.println("Sat");
                    break;

                case 7:
                    System.out.println("Sun");
                    break;

                default:
                    System.out.println("please enter the valid number from 1 to 7");
                    break;


            }
        } else {
            System.out.println("Invalid int is entered");
        }
    }
}