package ex_04_Operators;

public class Lab38_inteview_Concantination_plus {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);//output=30

        //+ String concantenation operator
        String first_name = "savita";
        String last_name = "sathe";
        System.out.println(first_name + last_name);//savitasathe

        //on string only +allow to concantenate
//        System.out.println(first_name-last_name);//not allowed-Operator '/' cannot be applied to 'java.lang.String',
//        System.out.println(first_name*last_name);//not allowed
//        System.out.println(first_name/last_name);//not allowed

        //+ behaves arithmetic when int
        //+ behaves concantinate when String

        //interview question
        //1.from left o right JVM will check so first concantination is there then all will concantinate
        System.out.println(first_name + last_name + a + b);//output:savitasathe1020

        //2.what if arithmetic is first
        System.out.println(a + b + first_name + last_name);//output:30savitasathe

        //3.string concate with bracket arithmentic-
        //BODMAS-bracket of div,mul,add,sub
        System.out.println(first_name + last_name + (a + b));//bracket execute first-savitasathe30


    }
}
