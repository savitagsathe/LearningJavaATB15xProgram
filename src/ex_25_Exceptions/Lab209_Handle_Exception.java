package ex_25_Exceptions;

public class Lab209_Handle_Exception {
    static void main(String[] args) {
        int a=0;
        try {
            a=10/0;      //ArithmeticException: / by zero
        } catch (Exception e) {
            System.out.println("divide by zero not allowed!!");
        }

        System.out.println(a);
    }
}
//checked exception JVM knows about it
