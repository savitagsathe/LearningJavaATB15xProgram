package javatests;

/* Write a Java program to reverse a given number using a do-while loop */

public class Reverse_a_Number {
    static void main(String[] args) {
        int num=89,rev=0;
        do{

               int rem=num%10;
               rev=rev*10+rem;
               num=num/10;

        }while(num!=0);
        System.out.println("Reverse="+rev);
  }
    }

