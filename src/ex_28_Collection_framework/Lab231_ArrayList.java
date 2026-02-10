package ex_28_Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab231_ArrayList {
    static void main(String[] args) {
        List list=new ArrayList();
        list.add("ab");
        list.add("cd");
        list.add("ef");
        list.add(123);
        list.add(false);

//List functions
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));

        //Print List element
        System.out.println(" 1. for loop ");
        for (int i=0;i<list.size();i++){//never se equal bcoz it stat from 0 so IndexOutOfBoundsException
            System.out.println(list.get(i));
        }

        //Best method to use
        System.out.println(" 2.for each loop ");
        for(Object o:list){//Object used due to we have different data types
            System.out.println(o);
        }

        System.out.println(" 3.Using Iterator ");
        Iterator iterator=list.iterator();//Iterator is interface available for List
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
