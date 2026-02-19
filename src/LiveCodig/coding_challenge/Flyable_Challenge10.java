package LiveCodig.coding_challenge;
/*
Multiple Interface Implementation
Create interfaces "Flyable" and "Swimmable" with appropriate methods. Implement both in a "Duck" class.

Examples:
Input:
Create Duck object and call fly() and swim() methods
Output:
Duck is flying in the sky! Duck is swimming in the water!
💡 Explanation:Java supports multiple interface implementation, allowing a class to implement multiple contracts.
 */

// First interface
public interface Flyable_Challenge10 {
    public void fly();

}
// Second interface
interface Swimmable_Challenge10{
    public void swim();
}

// Duck class implementing both interfaces
class Duck implements Flyable_Challenge10,Swimmable_Challenge10{
    @Override
    public void fly(){
        System.out.println("Duck is flying in the sky! ");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}
// Main class
class Test_Multiple_Interface
{
static void main(String[] args) {
Duck d=new Duck();
d.fly();
d.swim();
}}