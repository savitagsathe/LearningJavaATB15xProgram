package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";//in string both will pointto same string no new string will create
        String s3="Hello";//still one string will be in string constant pool

        String s4="hello";//now it wil create 2 string 1.Hello  2.hello

        //New operator:it will create 3 new string in object area.does not matter if content is same
        String s5=new String("Hello");
        String s6=new String("Hello");
        String s7=new String("hello");

            }
    }

