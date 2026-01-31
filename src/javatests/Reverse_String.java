package javatests;

import java.util.Scanner;

public class Reverse_String {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=s.nextLine();

        for(int i=1;i<=name.length();i++){
            System.out.print(name.charAt(name.length()-i));
        }

    }
}
