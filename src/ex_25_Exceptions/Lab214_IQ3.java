package ex_25_Exceptions;

public class Lab214_IQ3 {
    public static void main(String[] args) {

int c=0;
int b=0;

        try {
            b=10/c;//vulnerable code should write in try and catch block
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
