package ex_14_Strings;

public class Lab141_Interview_P2 {
    public static void main(String[] args) {
        //== comparison operator will check the references of string
        String s1="Hello";
        String s2="Hello";

        String s3=new String("Hello");
        String s4=new String("Hello");
        String s5=new String("hello");

        //above total 4 string wil create 1 in pool and 3 in object area
        System.out.println(s1==s3);//false 1 in pool and 1 in object area
        System.out.println(s1==s4);//false 1 in pool and 1 in object area

        System.out.println(s3==s4);//false even though both are in object area they are not same bcoz they have different location

        System.out.println(s1==s2);//true both are same pointing to same location
        System.out.println(s4==s5);//false

        //equals(content)->check value
        System.out.println(s1.equals(s2));//true content are same
        System.out.println(s1.equals(s3));//true content are same
        System.out.println(s4.equals(s5));//false case of content is different(caps and small)
        //to ignorecase use equalsignore-savita,Savita,SavITa,SAVITA
        System.out.println(s4.equalsIgnoreCase(s5));//true
        //== check for the reference
        //equals check for the value



            }
    }

