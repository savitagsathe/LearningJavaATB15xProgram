package ex_28_Collection_framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab245_SET_MAP_TreeDifference {
    public  static void main(String[] args) {
        Set<String> hs=new HashSet();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Watermelon");
        hs.add("Watermelon");//only 3 element will count bcoz dupicate will not consider
        hs.add(null);//one null allowed.2 null will not consider
        hs.add(null);
       // hs.add(123);//other data type will not allowed due o non generic
        System.out.println(hs);
        //output:[null, Apple, Watermelon, Banana]

        System.out.println("-----------------Linked List------------------------");
        Set lhs=new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);//5 element will print .if we make small 'watermelon' it become 6.
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("-----------------TreeSet------------------------");
        // Black and Red Tree mechanism to store the element.
        // Natural Sorting order is maintained.
        Set ts=new TreeSet();
        ts.add("Dpple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Watermelon");
        ts.add("Watermelon");
        System.out.println(ts);
        ts.add(123);//different data type not allowed sorting will not happen.ClassCastException
        ts.add(null);//null not allowed sorting will not happen













    }

}
