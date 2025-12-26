package ex_02_Java_Basics;

public class Lab026_UnderscorePrintIssue {
    static void main(String[] args) {
       // for printing underssore have value jdk8 onwards
        int _=10;
        //System.out.println(_);//Using '_' as a reference is not allowed

        //dolar is allowed to print
        int $=10;
        System.out.println($);
    }
}
