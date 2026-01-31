package ex_20_OOPS_polymorphism.methodoverriding;

public class Lab189_MethodOverriding {
    static void main(String[] args) {
        Father f1=new Father();
        f1.home();//2BHK
        Savita s=new Savita();
        s.home();//3BHK
        Father f=new Savita();
        f.home();//3BHK

        //Savita s2=new Father();
        //when father is born child reference cannot be given to father
    }


}
class Father{
    void home(){
        System.out.println("2BHK");
    }


}
class Savita extends Father{
    void home(){
        System.out.println("3BHK");
    }
}