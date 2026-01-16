package ex_14_Strings;

public class Lab150_String_Builder_replace {
    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("Java");
        stringBuilder.append("Programming");
        System.out.println(stringBuilder);//JavaProgramming


        stringBuilder.replace(0,4,"C++");
        System.out.println(stringBuilder);//  C++Programming










    }
    }

