package ex_25_Exceptions;

public class Lab210_Try_Catch {
    static void main(String[] args) {
        System.out.println("1");
        try{
            int a=10/0;

        } catch (ArithmeticException e) {
            System.out.println("Are you fool");
        }
        System.out.println("2");
    }
}

