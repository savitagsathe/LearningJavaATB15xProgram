package ex_28_Collection_framework.Comparable_Vs_comparator;

import java.util.ArrayList;
import java.util.*;

public class LabComparator {
    static void main(String[] args) {
        List<Employee2>list=new ArrayList();
        list.add(new Employee2(100,"John",100));
        list.add(new Employee2(101,"Alice",134));
        list.add(new Employee2(102,"Bob",234));

        //here marks we can sort but the above one how to sort
        List<Integer> marks = new ArrayList<>();
//        marks.add(100);
//        marks.add(90);
//        marks.add(92);
//        Collections.sort(marks);
//        System.out.println(marks);

        //I want to sort the employee.So can we pass the list directly
        //Collections.sort(list);not allowed.So to overcome this we have to use comparator
        System.out.println(list);
        System.out.println(" --Comparator--- ");

        Comparator<Employee2> idComparator = (e1, e2) -> e1.id - e2.id;
        Comparator<Employee2> salaryComparator = (e1, e2) -> e1.salary - e2.salary;
        Comparator<Employee2> nameComparator = (e1, e2) -> e1.name.compareTo(e2.name);

        Collections.sort(list,salaryComparator);
        System.out.println(list);//[Employee{id=100, name='John', salary=100}, Employee{id=101, name='Alice', salary=134}, Employee{id=102, name='Bob', salary=234}]

    }
    }

class Employee2{
    Integer id;
    String name;
  Integer salary;

    Employee2(Integer id,String name,Integer salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}