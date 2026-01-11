package javatests;

import java.util.Scanner;
/*Write a Java program to check whether a given number is even or odd using arithmetic operators.*/

public class Even_or_Odd_Number {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();

        //Method2: if else statement
//        if(num%2==0){
//            System.out.println(num+" is Even");
//        }else {
//            System.out.println(num+" is Odd");
//        }

        //Method2:Ternary operator
        System.out.println(num%2==0?"Even Number":"Odd Number");


    }
}
