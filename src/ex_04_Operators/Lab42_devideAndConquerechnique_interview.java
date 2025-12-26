package ex_04_Operators;

public class Lab42_devideAndConquerechnique_interview {
    static void main(String[] args) {
        int balaji_salary=12;
        boolean b=!(balaji_salary>10||balaji_salary<5);
        System.out.println(b);//output false
        //divideAndconquertechnique
        //a->balaji_salary>10->12>10=true
        //b->balaji_salary<5->12<5=false
        //a||b->(true||false)=>true
        //!(true)->false
    }
}
