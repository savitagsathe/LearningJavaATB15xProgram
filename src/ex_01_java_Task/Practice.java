package ex_01_java_Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String str="rajendra 12345   ";
        str=str.toLowerCase();

        int letterCount=0;
        int spaceCount=0;
        int digitCount=0;

        for (char ch:str.toCharArray()){
            if (Character.isLetter(ch)){
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }else if(Character.isWhitespace(ch)){
                spaceCount++;
            }
        }
        System.out.println("Char count: "+letterCount);
        System.out.println("Digit count: "+digitCount);
        System.out.println("space count: "+spaceCount);
   }
    }


