package ex_14_Strings;

public class Lab147_String_Builder_Vs_Buffer {
    public static void main(String[] args) {
        //90% we use string
        String s0="savita";
        String s1=new String("savita");

        //10% we use stringbuffer and builder
        StringBuffer stringBuffer=new StringBuffer("savita");
        StringBuilder stringBuilder=new StringBuilder("savita");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());





    }
    }

