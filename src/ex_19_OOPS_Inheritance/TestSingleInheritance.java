package ex_19_OOPS_Inheritance;

public class TestSingleInheritance {
    public static void main(String[] args) {
        Son s=new Son();
        //System.out.println(s.gold_f);
        s.bhk3();
        //s.bbh2k();

        Father f=new Father();
        System.out.println(f.gold_f);
        f.bbh2k();
       // f.bhk3();//cant access sons property


    }
}
