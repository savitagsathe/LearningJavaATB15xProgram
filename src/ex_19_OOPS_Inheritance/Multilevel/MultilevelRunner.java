package ex_19_OOPS_Inheritance.Multilevel;

public class MultilevelRunner {
    public static void main(String[] args) {
     Son prajyot =new Son();
     prajyot.gf();
     prajyot.bhk3();
     prajyot.home();
     prajyot.extraMoney();

     Father f=new Father();
     f.extraMoney();
     f.gf();
     f.home();

     GrandFather gf=new GrandFather();
     gf.gf();
     gf.home();

     //dynamic dispatch
        GrandFather gf1=new Son();
        Father f1=new Son();
       // Son s1=new GrandFather();//not allowed
        // Son s1=new Father();//not allowed
    }
}
