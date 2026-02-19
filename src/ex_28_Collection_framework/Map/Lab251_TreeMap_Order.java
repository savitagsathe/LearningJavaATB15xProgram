package ex_28_Collection_framework.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab251_TreeMap_Order {
    static void main(String[] args) {
Map<String,Integer>prices=new TreeMap<>();
        prices.put("Banana",40);
        prices.put("Apple",120);
        prices.put("Cherry",200);
        prices.put("Date",350);
        prices.put(null,1);//NullPointerException treeMap will not allow null values bcoz it cant sort it

        // {Apple=120, Banana=40, Cherry=200, Date=350}
        // ✅ Sorted alphabetically by key!
        System.out.println(prices);

    }
}
