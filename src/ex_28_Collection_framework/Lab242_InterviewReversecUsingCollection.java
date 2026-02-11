package ex_28_Collection_framework;

import java.util.*;

public class Lab242_InterviewReversecUsingCollection {
    static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());

        for(Integer o:al){
            System.out.println(o);//o/p: 4 3 2 1


        }
    }
}
