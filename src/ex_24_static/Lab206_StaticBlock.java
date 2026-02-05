package ex_24_static;

public class Lab206_StaticBlock {
    public static void main(String[] args) {
A a=new A();
A.m1();
    }
}
class A{
    //the moment object is created static block and IIB block will get called
    //static initialization block
    static {
        System.out.println("Called only once when class is loaded");
        System.out.println("You can write a code reading a excel,file,");
    }
    //Instance initialization block
    {
        System.out.println("Instance initialization block");
    }
    static  int a=10;
    static void m1(){
        System.out.println("static funcion");
    }

}