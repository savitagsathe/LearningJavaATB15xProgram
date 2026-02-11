package ex_28_Collection_framework.Set;

import java.util.*;

public class Lab243_SET {
    public  static void main(String[] args) {
        Set hs=new HashSet();
        hs.add("savita");//duplicate wont allow it will print one if we write
        hs.add("savita");
        hs.add("sathe");
        System.out.println(hs);//o/p:[sathe, savita]

        Set LinkedHashSet=new LinkedHashSet();
        Set treeSet=new TreeSet();

    }

}
