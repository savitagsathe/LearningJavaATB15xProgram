package ex_01_java_Task.PersonalInterview;

import java.util.HashMap;

public class PrintDuplicateCharactersInGivenString {
   public  static void main(String[] args) {
        String str="rajendra";

        //Hashmap to store how many times each character appear
       HashMap<Character,Integer>charCount=new HashMap<>();

       //count each character
       for (char ch:str.toCharArray()){
           charCount.put(ch,charCount.getOrDefault(ch,0)+1);
       }
       System.out.println("Duplicate characters are:");
       // Step 2: Print duplicate characters with count
       for (char ch:str.toCharArray()){
           if (charCount.get(ch)>1){
               System.out.println(ch+"=>"+charCount.get(ch));
               // Make count 0 to avoid printing same duplicate again
               charCount.put(ch,0);
               // r=>2
               //a=>2
               //r=>2
               //a=>2

           }
       }
    }
}
