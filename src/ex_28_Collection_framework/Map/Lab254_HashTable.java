package ex_28_Collection_framework.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lab254_HashTable {
    static void main(String[] args) {
        // Map - K, V,  null values allows
        // Hashtable K,V - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one.
        //Hashtable not allow null values but hashmap allow atleast one null key and value
        Hashtable<Integer,String>ht1=new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
        //ht1.put(4,null);key and value null not allowed at all in hashtable
       // ht1.put(null,"five");

        Map<String,Integer>map=new HashMap<>();
        map.put("id1",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);//multiple values can be null
        map.put("id5",null);
        map.put(null,100);
        map.put(null,120);//more than one key cannot be null .if there it will take latest one
        System.out.println(map);









    }
}
