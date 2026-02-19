package ex_01_java_Task.PersonalInterview;

import java.util.HashSet;
/*WAP to remove duplicate characters (just asked to do modification in print duplicate character program)
Input  String str="rajendra";
output:rajend
 */
public class RemoveDuplicateCharacters {
    static void main(String[] args) {
        String str="rajendra";

        HashSet<Character>charCount=new HashSet<>();
        String result="";
        //convert string into character array and iterate one by one character
        for (char ch:str.toCharArray()){
         if (!charCount.contains(ch)){
             charCount.add(ch);
             result=result+ch;
         }
        }
        System.out.println("After removing duplicates: "+result);

    }
}
