package ex_28_Collection_framework.Map;

import java.util.*;

public class Lab252_Map_ReaScenario {
    static void main(String[] args) {
        //store student info
        Map<String,Object> student1 = new HashMap();
      // student1.put("name","Diwakar");
        student1.put("name","Pramod");
        student1.put("name","Pramod");//If we write the duplicate key and value it will replace it and give latest one
        student1.put("phone","976543210");
        student1.put("address","BLR");
        student1.put("home_address","BTM");


        System.out.println(student1);
        System.out.println(student1.getOrDefault("rollno",null));

        Map<String,Object> student2 = new LinkedHashMap<>();//object bcoz we are storing different data type value
        student2.put("name","Diwakar");
        student2.put("phone","976543210");
        student2.put("address","DEL");
        student2.put("home_address","RG");

        System.out.println(student2);

//Set dont have key valu pair and dont allow duplicate value
        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

    }
}
