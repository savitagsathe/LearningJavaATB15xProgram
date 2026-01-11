package ex_07_switchcase;

import java.util.Scanner;

public class Lab085_switch_without_break {



    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the 1 to 7 number to print the day");

            int day = s.nextInt();

            switch (day) {
                case 1:
                    System.out.println("mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
        }
        //output : nothing : no match no outout
    }
}