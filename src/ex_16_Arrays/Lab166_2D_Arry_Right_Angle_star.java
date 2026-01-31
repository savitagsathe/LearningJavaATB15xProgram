package ex_16_Arrays;

import java.util.Scanner;
/*
        *
        **
        ***

*/
public class Lab166_2D_Arry_Right_Angle_star {
    static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the n for the pattern for e.g n=3");
        int n=s.nextInt();

        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
