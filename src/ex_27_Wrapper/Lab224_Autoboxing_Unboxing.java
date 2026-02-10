package ex_27_Wrapper;

public class Lab224_Autoboxing_Unboxing {
    static void main(String[] args) {
        int a=10;
        Integer b=a;//Autoboxing
        System.out.println(b);//b has attribute and method

        Integer c=10;
        int d=c;//Unboxing
        System.out.println(d);//d has lost attribute and method


    }
}
