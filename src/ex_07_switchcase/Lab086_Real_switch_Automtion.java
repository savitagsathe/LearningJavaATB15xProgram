package ex_07_switchcase;

import java.util.Locale;
import java.util.Scanner;

public class Lab086_Real_switch_Automtion {
//web automation
    //i will ask the user to give me the input from browser which he wants to
    //start the automation in tha browser


    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter the Bowser:");

            String browser = s.next();
            browser=browser.toLowerCase();

            switch (browser) {
                case "chrome":
                    System.out.println("starting the chrome");
                    System.out.println("----------------");
                    System.out.println("TC001");
                    System.out.println("Tc002");
                    break;
                case "Firefox":
                    System.out.println("starting the firefox");
                    break;
                case "edge":
                    System.out.println("execute the edge code");
                    break;
                default:
                    System.out.println("I have no idea which browwser is this");
                    break;
        }

    }
}