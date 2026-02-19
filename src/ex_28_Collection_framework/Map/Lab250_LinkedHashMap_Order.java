package ex_28_Collection_framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab250_LinkedHashMap_Order {
    static void main(String[] args) {
Map<String,String>countries=new LinkedHashMap<>();
countries.put("IN","India");
countries.put("US","united State");
countries.put("UK","united Kigdom");
countries.put("JP","Japan");

//whatever order we mentioned it will print that
System.out.println(countries);//{IN=India, US=united State, UK=united Kigdom, JP=Japan}

    }
}
