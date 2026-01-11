package coding_250questions_practice;
//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.

import java.util.Scanner;

public class Triangle_Classifier {
    static void main(String[] args) {
        //take input from user
       Scanner s=new Scanner(System.in);
        System.out.println("Enter the Side1:");
       int side1=s.nextInt();
        System.out.println("Enter the Side2:");
        int side2=s.nextInt();
        System.out.println("Enter the Side3:");
        int side3=s.nextInt();

        //int side1 = 10, side2 = 100, side3 = 10;//hard code value

        if (side1 == side2 && side2 == side3) {
            System.out.println("triangle is equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("triangle is isosceles");
        } else {
            System.out.println("triangle is scalene");
        }
    }
}
