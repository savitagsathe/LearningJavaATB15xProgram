package LiveCodig.coding_challenge;
/*
Method Overriding Demo
Write a program to demonstrate method overriding by creating parent and child classes with the same method signature.
Examples:
Input:Parent and Child objects calling display() method
Output:Parent class display method Child class display method
💡 Explanation:Method overriding allows a subclass to provide a specific implementation of a method defined in its parent class.
 */

public class Method_Overriding_Challenge12 {
    // Parent class
public void display(){
    System.out.println("Parent class display method");
}
}

// Child class
class Child extends Method_Overriding_Challenge12{
@Override
    public void display(){
    System.out.println("Child class display method");
}
}
// Main class
class Test_Challenge12{
    static void main(String[] args) {
        Method_Overriding_Challenge12 parent=new Method_Overriding_Challenge12();
        parent.display();// Calls Parent version

        Method_Overriding_Challenge12 child=new Child();// Polymorphism
        child.display();// Calls Child version (runtime)
    }
}