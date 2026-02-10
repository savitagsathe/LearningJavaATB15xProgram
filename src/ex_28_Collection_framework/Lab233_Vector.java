package ex_28_Collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab233_Vector {
    static void main(String[] args) {
        //Vector is thred safe .Whatever thredsafe we are not using in automation.
        // Thread safe means if toy is ther in 2kidshal houtr one kid use and half
        // hour nother kid use .So there is slowness in process.So it is synchonized

        Vector v = new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));

        ArrayList a  = new ArrayList();
        a.add("prrammod");
        a.add("dutta");

    }

}
