package ex_28_Collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List {
    static void main(String[] args) {
        List friuts= List.of("orange","apple","guava","mango","watermelon");
        System.out.println(friuts);
       //List have static and default methods
       //We cant do the objec of List bcoz its a interface.So we have to use ArrayList class to implement List interface

        ArrayList arr=new ArrayList();
        arr.add("savita");
        arr.add(123);
        arr.add(true);
        //solve the array problem of storing different type of element


    }

}
