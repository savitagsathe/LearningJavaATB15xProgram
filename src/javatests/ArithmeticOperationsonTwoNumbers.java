package javatests;

import java.util.Scanner;
/*Write a Java program that takes two integer numbers and prints their sum,
difference, multiplication, division, and remainder.*/

public class ArithmeticOperationsonTwoNumbers {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=s.nextInt();
        System.out.println("Enter the second number");
        int num2=s.nextInt();

        System.out.println("Sum of 2 numbers:"+(num1+num2));
        System.out.println("Substraction of 2 numbers:"+(num1-num2));
        System.out.println("multiplication of 2 numbers:"+(num1*num2));
        System.out.println("division of 2 numbers:"+(num1/num2));
        System.out.println("remainder of 2 numbers:"+(num1%num2));


    }
}
