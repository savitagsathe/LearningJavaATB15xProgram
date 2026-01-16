package ex_14_Strings;

public class Lab149_String_Builder {
    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("savita");
        stringBuilder.append("123");
        System.out.println(stringBuilder);//savita123

        StringBuilder sb=new StringBuilder("hello");
        sb.append("world");
        System.out.println(sb);//helloworld
        sb.reverse();
        System.out.println(sb);//dlrowolleh
        sb.replace(0,4,"savita");
        System.out.println(sb);









    }
    }

