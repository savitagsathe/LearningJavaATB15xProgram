package ex_06_Increment_Decreament_Operator;

public class Lab71_incDec_Post_Operator {
    static void main(String[] args) {

//        int a=10;
//        System.out.println(++a);//11


        //post increment-print first and then increment
        int a_post=10;
        int b=a_post++;
        System.out.println(a_post);//11
        System.out.println(b);

        //ERT-expression and result table
        //line no|a|result(b)
        //11|10|NA
        //12|11|10




    }
}
