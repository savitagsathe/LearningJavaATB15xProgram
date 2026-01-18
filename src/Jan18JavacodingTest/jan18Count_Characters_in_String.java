package Jan18JavacodingTest;

public class jan18Count_Characters_in_String {
    static void main(String[] args) {
        //Write a Java program to count the total number of characters in a given string (excluding spaces).
        String s="savita    sathe";
        int count=0;
        for(int i=0;i<s.length();i++){
           if (s.charAt(i)!=' '){
            count++;
        }

    }
        System.out.println("Total character excluding spaces:"+count);
}}
