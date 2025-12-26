package ex_02_Java_Basics;

public class Lab024_Constants {

    static void main(String[] args) {
        int a=10;
        a=20;
        System.out.println(a);

        //constant variable value cannot be changed
        final float pi=3.14f;
        //pi=3.15f;//Cannot assign a value to final variable 'pi
        System.out.println(pi);
    }
}
