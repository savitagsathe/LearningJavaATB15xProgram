package ex_28_Collection_framework.Comparable_Vs_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
 public class LabComparable {
    static void main(String[] args) {
        Employee e1=new Employee(3,"Amit");
        Employee e2=new Employee(1,"Pramod");
        Employee e3=new Employee(2,"Dutta");

        List<Employee>employeeList=new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println(employeeList);//here it will print only hashcode will print to see the detail override the toString()
        //[Employee{id=3, name=Amit'}, Employee{id=1, name=Pramod'}, Employee{id=2, name=Dutta'}]

        /*here marks we can sort using collections but the above one how to sort
        List<Integer> marks = new ArrayList<>();
//        marks.add(100);
//        marks.add(90);
//        marks.add(92);
//        Collections.sort(marks);
//        System.out.println(marks);*/
        //sort them based on the id
        Collections.sort(employeeList);//we cant sort using collection if multiple data types used .The below
                                       // one we can sort using CompareTo()

        System.out.println(employeeList);//[Employee{id=1, name=Pramod'}, Employee{id=2, name=Dutta'}, Employee{id=3, name=Amit'}]
    //here we sorted by id but if we want by name we have to use compareTo() .Problem of Comparable is we can sort by only 1 at a time

    }

}
 class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;

    public void setId(Integer id){
        this.id=id;
    }
public Integer getId()
{
    return id;
}
public void setName(String name){
       this.name=name;
    }

    public String getName(){
        return name;

    }
    public String printDetails(){
       return name+"-"+id;
    }
     Employee(Integer id,String name){
        this.id=id;
        this.name=name;
    }
   @Override
    public String toString(){

        return "Employee{"+"id="+id+", name="+name+'\''+'}';
    }
     @Override
     public int compareTo(Employee o){

        // return this.id - o.id;//to sort the id
         return this.name.compareTo(o.name);//to sort the name.Here we are nt using - bcoz string cant be minus
         //output=>[Employee{id=3, name=Amit'}, Employee{id=2, name=Dutta'}, Employee{id=1, name=Pramod'}]
     }
}