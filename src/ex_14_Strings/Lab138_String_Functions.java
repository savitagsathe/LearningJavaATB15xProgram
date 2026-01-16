package ex_14_Strings;

public class Lab138_String_Functions {
    public static void main(String[] args) {
        //output: A
        char ch='A';
        System.out.println(ch);

        //output: savita
        String s1="savita";
        System.out.println(s1);//savita
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        //How many strings are in string constant pool
        //savita and SAVITA 2 strings are present
        System.out.println(s1.toLowerCase());//it will not create another string bcoz its already there
        System.out.println(s1.concat("sathe"));
        //How many strings are in string constant pool now?
         //3 strings are present in pool? savita,SAVITA and savita sathe 3 strings are present
            }
    }

