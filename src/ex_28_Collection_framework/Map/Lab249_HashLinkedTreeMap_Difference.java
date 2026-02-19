package ex_28_Collection_framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab249_HashLinkedTreeMap_Difference {
    static void main(String[] args) {
            // Map is key - value
            // name : pramod,
            // rollno : 1
Map m1=new HashMap();
m1.put("name","Pramod");
m1.put("rollno",1);
m1.put("phone",234561789);
System.out.println(m1);//Hashmap order does not matter {phone=234561789, name=Pramod, rollno=1}

//LinkedHashMap
            Map m2=new LinkedHashMap();
            m2.put("name","Pramod");
            m2.put("rollno",1);
            m2.put("phone",234561789);
            System.out.println(m2);//LinkedHashmap order matter{name=Pramod, rollno=1, phone=234561789}
//TreeMap

            Map m3=new HashMap();
            m3.put("name","Pramod");
            m3.put("rollno",1);
            m3.put("phone",987654321);
            System.out.println(m3);//order will be natural order by default {phone=987654321, name=Pramod, rollno=1}=>npr


    }
}
