package ex_01_java_Task.PersonalInterview;

public class FindCountOfVowelinString {
    public static void main(String[] args) {
     String str="rajendra";
     str=str.toLowerCase();//If we wont write it will not consider it vowel
     int count=0;

     for (int i=0;i<str.length();i++){
         char ch= str.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){//If we write in small or caps it will consider vowels
             count++;
         }
     }
        System.out.println("Vowels count in given string:"+count);
    }
}
