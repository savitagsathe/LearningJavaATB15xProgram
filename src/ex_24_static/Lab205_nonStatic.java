package ex_24_static;

public class Lab205_nonStatic {
    int nonstatic;//class level variablesare non static
    static String statica;

    public static void main(String[] args) {
    int a=10;//Local variable
        //System.out.println(nonstatic);//cant access non static into static
        System.out.println(statica);
    }
}
