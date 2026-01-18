package Jan18JavacodingTest;

import java.util.Scanner;

public class Compare_Two_Strings {
    static void main(String[] args) {
        //Write a Java program to compare two strings and check whether they are equal or not.
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1=s.nextLine();

        System.out.println("Enter the second string");
        String str2=s.nextLine();

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("both stings are equal");
        }
        else {
            System.out.println("both stings are not equal");
        }

}}
