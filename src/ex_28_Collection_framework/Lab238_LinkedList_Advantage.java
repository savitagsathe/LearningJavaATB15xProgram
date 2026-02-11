package ex_28_Collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lab238_LinkedList_Advantage {
    static void main(String[] args) {
        //Requirement where we want to modify the collection
        //many times,then we always use the linkedList

        Scanner s=new Scanner(System.in);
        String continuInput="Y";

        List<String>names=new ArrayList<>();

        while (continuInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name that you want to store");
           String name= s.next();
           names.add(name);
           s.nextLine();
            System.out.println("Do you want to add anotehr one?Y/N");
            continuInput=s.nextLine();
        }
        for (String name:names){
            System.out.println(name);
        }
        s.close();
    }
}
