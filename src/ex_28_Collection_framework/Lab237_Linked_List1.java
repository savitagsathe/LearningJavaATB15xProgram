package ex_28_Collection_framework;

import java.util.LinkedList;
import java.util.List;

public class Lab237_Linked_List1 {
    static void main(String[] args) {

        LinkedList<String>list=new LinkedList<>();

        //Adding element
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango");//add at first
        list.addLast("Grapes");//add at last
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));

        System.out.println(list.remove());
        System.out.println(list);

        System.out.println(list.remove("Banana"));
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println(list.remove(2));
        System.out.println(list);

    }
}
