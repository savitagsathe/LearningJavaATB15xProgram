package LiveCodig.coding_challenge;
/*
Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
Input:
Create Person objects with names "John" (25) and "Alice" (30)
Output:
Name: John, Age: 25 Name: Alice, Age: 30
 */
public class Person {

    static void main(String[] args) {
        Person p1=new Person("John",25 );
        p1.display();

        Person p2=new Person("Alice",30 );
        p2.display();

    }
    private String name;
    private int age;


    Person(String name,int age){
     this.name=name;
     this.age=age;
    }
    public void display(){
        System.out.println("name:"+name+", Age:"+age);
    }
}
