package ex_28_Collection_framework.Map;

import java.util.*;

public class Lab253_Map_Iterate {
    static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("id1",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);//multiple values can be null
        map.put("id5",null);
        map.put(null,100);
        map.put(null,120);//more than one key cannot be null .if there it will take latest one
        System.out.println(map);

        for (Map.Entry<String,Integer>item:map.entrySet()){
            System.out.println(item.getKey()+"=>"+item.getValue());
        }







    }
}
