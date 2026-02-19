package LiveCodig.coding_challenge;
/*
Outer and Inner Class Implementation
Create a class "Outer" with an inner class "Inner". Access the inner class from the outer class and demonstrate their interaction.

Examples:
Input:Outer class with variable x=10, Inner class accessing x
Output:Outer class variable x: 10 Inner class accessing outer variable: 10
💡 Explanation:Inner classes have access to all members of the outer class, including private members. They are useful for helper classes.
 */

public class Outer_Challenge13 {
    private int x=10;//Outer class variable



// Inner class
class Inner {
    public void display() {
        System.out.println("Inner class accessing outer class variable:" + x);
    }}

    public void showOuter(){
        System.out.println("Outer class variable x:"+x);
        // Creating object of Inner class inside Outer
        Inner inner=new Inner();
        inner.display();
    }


}
 class TestOuter{
     static void main(String[] args) {
         Outer_Challenge13 outer=new Outer_Challenge13();
         outer.showOuter();
     }

}
