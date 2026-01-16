package ex_14_Strings;

public class Lab148_String_Buffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer=new StringBuffer("savita");
        stringBuffer.append("Sathe");
        System.out.println(stringBuffer);//savitaSathe

        //we can do by string also but it will create 2 string
        String s1="savita";
        s1=s1+"sathe";
        System.out.println(s1);//savitasathe  in memory it will create savita & savitasathe not recommended






    }
    }

