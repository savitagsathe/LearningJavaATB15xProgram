package LiveCodig;

import java.util.Scanner;
/*Write a Java program that reads two integers from input and prints their sum.
Input Format: Two integers separated by a space
Output Format: A single integer representing the sum*/

public class Sum_of_Two_Numbers {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        System.out.println("Enter the first number");
        int num1=scanner.nextInt();

        System.out.println("Enter the second number");
        int num2=scanner.nextInt();

        int sum=num1+num2;
        System.out.println("Sum of two numbers is:"+sum);

    }
}
