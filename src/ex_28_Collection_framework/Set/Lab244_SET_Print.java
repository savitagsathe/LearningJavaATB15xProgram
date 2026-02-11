package ex_28_Collection_framework.Set;

import java.util.*;

public class Lab244_SET_Print {
    public  static void main(String[] args) {
        Set<Integer> hs=new HashSet();
        hs.add(1);//duplicate wont allow it will print one if we write
        hs.add(3);
        hs.add(2);
        System.out.println("Set elements:"+hs);
        //Print hashset values
        Iterator iterator=hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
//avoid duplicate:Set
// dont keep the order:Hashset
    //keep the order:LinkedSet
    //Sort the element:treeSet
}
