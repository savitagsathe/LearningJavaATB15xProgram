package ex_05_type_casting;

public class Lab060_Typecasting {
    public static void main(String[] args) {
        long phone=9876543987L;
        //short s=phone//narrowing implicit notalllowed
        short s1=(short)phone;//only narrowing explicit allowed

    }
}
