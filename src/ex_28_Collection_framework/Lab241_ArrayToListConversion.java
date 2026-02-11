package ex_28_Collection_framework;

import java.util.Arrays;
import java.util.List;

public class Lab241_ArrayToListConversion {
    static void main(String[] args) {
        String arr[]={"Java","Python","C#"};
        List<String>list= Arrays.asList(arr);//convert Array to List
        System.out.println(list);
    }
}
