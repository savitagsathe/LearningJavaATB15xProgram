package ex_01_java_Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice {
    public static void main(String[] args)
    {
     String str="rajendra";
     //create a Hashmap to store how many times each character appear
        HashMap<Character,Integer>charCount=new HashMap<>();

        //step1:count each character count
        for (char ch:str.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        System.out.println("Duplicate characters");
        //step2 print duplicates
        for (char ch:str.toCharArray()){
        if(charCount.get(ch)>1){
            System.out.println(ch+"=>"+charCount.get(ch));
            charCount.put(ch,0);
        }
        }
   }
    }


