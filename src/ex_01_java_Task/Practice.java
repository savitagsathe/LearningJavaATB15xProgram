package ex_01_java_Task;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

   int side1=45,side2=45,side3=45;
   if (side1==side2&&side2==side3){
       System.out.println("triangle is equilateral ");
   } else if (side1==side2||side2==side3||side1==side3) {
       System.out.println("triangle is isosceles ");
   }else {
       System.out.println("triangle is scalene  ");
   }
    }


    }

