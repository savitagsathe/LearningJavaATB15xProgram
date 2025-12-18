package ex_02_Java_Basics;

public class Lab015_LocalVariables {
    public static void main(String[] args) {
//variable syntax=data type variable_name=variable_value
// Variable types=Local,static,instance
//1.local variable: means used within the method
byte age=20;

//byte->data type-type of container
//age->variable name|identifier
        //=->assignment operator-type of container
        //20->variable value-literal
        //byte age=20;// with same name not allowed
        age = 33;//we have to reuse by only variable name remove data type
        System.out.println(age);//latest value print i.e 33


        //2.int
        //int a=10.60;// cant store decimal in int
        int b=10; //without sign
        int c=-20;//with sign
        System.out.println(c);//will print -20 only
        b=10+1;
        System.out.println(b);//will print latest value i.e.11


    }






}
