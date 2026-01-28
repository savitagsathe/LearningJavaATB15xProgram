package ex_01_java_Task;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        int n=5;
        for(int i=1;i<n;i++){
            for(int space=1;space<n-i;space++){
                System.out.println(" ");
            }
            for (int j=1;j<i*2-1;j++)
            {
                System.out.print("*");
            }
        }
   }
    }


