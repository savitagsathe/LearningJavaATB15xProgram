package ex_28_Collection_framework.Map;

import java.util.*;

public class Lab248_Map_p2 {
    static void main(String[] args) {

Map m1=new HashMap();
Map m2=new LinkedHashMap();
Map m3=new TreeMap();
//Map m4=new WeakHashMap(); //very rarely used
//Map m5=new EnumMap();//will not use at all

// Difference in HashMap,LinkedHashMap,TreeMap
Map<String ,Integer>marks=new HashMap();
// ⚠️ No guaranteed order!
marks.put("Alice",95);
marks.put("Bob", 82);
marks.put("Charlie", 90);
marks.put("Dave", 78);
System.out.println(marks); //o/p => {Bob=82, Alice=95, Charlie=90, Dave=78}

       //Accessing element in map
        System.out.println(marks.get("Alice"));//95
        System.out.println(marks.get("Datta"));//null if key not found
        System.out.println(marks.getOrDefault("Pramod",0));// 0 (key not found)

        //update element
        marks.put("Bob",88);
        System.out.println(marks.get("Bob"));

        //check
        System.out.println(marks.containsKey("Dave"));//true
        System.out.println(marks.containsKey(100));//false

        //size
        System.out.println(marks.size());//4

        //remove
        marks.remove("Dave");//remove key value automatically get removed
        System.out.println(marks);



    }
}
