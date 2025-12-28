package ex_05_type_casting;

public class Lab059_Typecasting_Narrowing {
    public static void main(String[] args) {
        int val=300;
        //byte b2=val;//implicit narrowing
        byte b=(byte) val;//explicit narrowing
        System.out.println(b);

        

    }
}
