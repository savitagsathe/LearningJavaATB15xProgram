package coding_practice;

import java.util.Scanner;
/*How to Take Input from Users?
You can take input from users using the Scanner class*/
public class TakeInputFromUser {
    public static void main() {
        // Create a Scanner object to read user input
        Scanner s=new Scanner(System.in);
        // Prompt the user for input
        System.out.println("Enter the name");
        // Read a line of text entered by the user
        String name=s.nextLine();

        //age
        // Prompt the user for a number
        System.out.println("enter the age");
        // Read an integer entered by the user
        int age=s.nextInt();
        // Display the user's input
        System.out.println("Hello,"+name+"!You are "+age+" years old");
    }
}
