package javatests;

import java.util.Scanner;
/*Write a Java program to find the maximum of two numbers using the ternary operator.*/

public class Maximum_of_Two_Numbers_Ternary {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=s.nextInt();
        System.out.println("Enter the second number");
        int num2=s.nextInt();

        System.out.println(num1>num2?"num1 is greater":"num2 is greater");

    }
}
