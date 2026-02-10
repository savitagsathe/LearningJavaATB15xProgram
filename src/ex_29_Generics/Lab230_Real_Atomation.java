package ex_29_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab230_Real_Atomation {
    static void main(String[] args) {
        //List<String>myList=new ArrayList<String>();//here we can access only String bcoz we hardcoded string
        List myList=new ArrayList();//If we dont mention nothing it will become generics
        myList.add("happy moment");
        myList.add(1234);
        myList.add(3.14);
    }
}
