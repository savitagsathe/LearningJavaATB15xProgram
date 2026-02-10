package ex_28_Collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab234_ArrayListSort {
    static void main(String[] args) {
        List marks=new ArrayList<>();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);//desc
        Collections.sort(marks);//asc -smallst to largest
        System.out.println(marks);
    }

}
