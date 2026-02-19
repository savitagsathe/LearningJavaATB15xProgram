package LiveCodig.coding_challenge;

 public class Animal_Challenge5 {
    /*
    Animal Sound Polymorphism
Create a class "Animal" and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.

Examples:
Input:
Create Dog and Cat objects and call makeSound()
Output:
Dog says: Woof! Woof! Cat says: Meow! Meow!
     */
    public void makeSound() {
        System.out.println("Animal makes sound");
    }


}
// Child class 1
class Dog extends Animal_Challenge5 {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}
// Child class 2
class Cat extends Animal_Challenge5 {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}
// Main class
class TestAnimal{
    static void main(String[] args) {
        Animal_Challenge5 dog=new Dog();
        Animal_Challenge5 cat=new Cat();

        dog.makeSound();
        cat.makeSound();

    }


}