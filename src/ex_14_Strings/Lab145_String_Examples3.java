package ex_14_Strings;

public class Lab145_String_Examples3 {
    public static void main(String[] args) {
        String s="unhappy".substring(2);
        System.out.println(s);//happy

        char[] arr="java".toCharArray();//java
        System.out.println(arr);//{'j','a','v','a'}

        boolean b=" ".isBlank();
        boolean b1="".isEmpty();
        System.out.println(b);//true

      String s2=  "ab".repeat(3);
        System.out.println(s2);//ababab

        boolean b2="JAva".equalsIgnoreCase("Java");
        System.out.println(b1);//true

        long count="a\nb\nc".lines().count();
        System.out.println(count);//3

        String name3="    savita    ";
        System.out.println(name3.trim());

        //===========================
      StringBuilder stringBuilder=new StringBuilder("savita");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);//ativas

        StringBuilder sd=new StringBuilder("Hi");
        System.out.println(sd.toString());//Hi

    }
    }

