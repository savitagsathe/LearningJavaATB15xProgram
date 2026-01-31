package ex_16_Arrays;

import java.util.Scanner;

public class Lab157_UseInputArrays {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();

        int[] numbers_mark=new int[size];
        for (int i=0;i<numbers_mark.length;i++){
            System.out.println("Enter the marks");
            numbers_mark[i]= s.nextInt();
        }

        System.out.println("=====================");
//print
        for (int i=0;i<numbers_mark.length;i++){
            System.out.println(numbers_mark[i]);
        }
//for each mostly used for printing purposes
        for (int item:numbers_mark){
            System.out.println(item);
        }

    }
}
