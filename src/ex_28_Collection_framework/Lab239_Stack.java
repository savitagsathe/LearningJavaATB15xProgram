package ex_28_Collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Lab239_Stack {
    static void main(String[] args) {
        //Stack is synchronized we are not going to use in automation
        Stack s1=new Stack();//LIFO-Last in first out

        Stack s=new Stack();
        s.add("savita");
        s.add("nikshita");
        s.add("Prajyot");

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.pop());//remove element at the top
        System.out.println(s);
        s.add("prashan't");
        System.out.println(s);
       //Duplicate allowed
        s.add("chetan");
        s.add("chetan");
        //push
        s.push("vijay");
        System.out.println(s);
        s.add(2,"lucky");//add have index also but push only add at top
        System.out.println(s);









    }
}
