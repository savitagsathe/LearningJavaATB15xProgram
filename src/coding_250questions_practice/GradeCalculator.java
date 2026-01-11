package coding_250questions_practice;
/*Write a program that calculates and displays the letter grade for a given numerical 
score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59*/
public class GradeCalculator {
    static void main(String[] args) {
        int marks = 91;
        if (marks >= 90 && marks <= 100) {
            System.out.println("Your grade is: A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Your grade is:B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Your grade is:C");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Your grade is:D");
        } else
            System.out.println("Your grade is:F");
    }}
