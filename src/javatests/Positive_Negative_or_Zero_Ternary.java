package javatests;

import java.util.Scanner;
/*Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.*/

public class Positive_Negative_or_Zero_Ternary {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num=s.nextInt();


        System.out.println((num>0)?"number is positive":(num<0)?"number is negative":"zero");

    }
}
