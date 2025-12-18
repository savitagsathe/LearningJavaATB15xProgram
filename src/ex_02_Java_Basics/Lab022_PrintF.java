package ex_02_Java_Basics;

public class Lab022_PrintF {
    public static void main(String[] args) {
        System.out.println("It will add a new line");
        System.out.println("It will not add a new line");

        System.out.printf("this is a normal text");//souf shortcut
        System.out.printf("this is a normal text");

        int a=10;
        System.out.println("value of a->"+a);
        System.out.println("value of a->"+a);

        //%d will replace value of a
        System.out.printf("value of a is %d",a);//output:value of a is 10
//        %d->int ,bte,short,long
//        %s->  String
//                %f->  float,double
//                %b=boolean


//advantage of printf->you can print multiple values at the same line-purpose is formatting the output
        int aa=90;
        int bb=56;

        System.out.printf("value of a=%d and b=%d",aa,bb);









    }






}
