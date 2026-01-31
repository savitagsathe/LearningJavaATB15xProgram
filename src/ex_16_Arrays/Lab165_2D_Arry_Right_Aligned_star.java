package ex_16_Arrays;

import java.util.Scanner;

/*
              *
             **
            ***

*/
public class Lab165_2D_Arry_Right_Aligned_star {
    static void main(String[] args) {

        int n=3;
        for(int i=0;i<n;i++){//0,1,2 rows

            for (int space=0;space<n-i-1;space++){
                System.out.print(" ");//if space not given it will print right aligned pyramid
            }
            for (int star=0;star<=i;star++){
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}
