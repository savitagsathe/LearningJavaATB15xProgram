package ex_25_Exceptions;

public class Lab211_Multiple_Catch {
    static void main(String[] args) {
        System.out.println("1");
        try{
            int a=10/0;

        } catch (ArithmeticException e) {
            System.out.println("Are you fool");
        }
        catch (Exception e){
            System.out.println("Are you fool too");
        }
        System.out.println("2");
    }
}

