package Jan18JavacodingTest;

import java.util.Scanner;

public class Convert_Stringto_Uppercase {
    static void main(String[] args) {
        //Write a Java program to convert a given string into uppercase and print the result.
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String name=s.nextLine();

        String scr=name.toUpperCase();
        System.out.println("Uppercase String: "+scr);

}}
