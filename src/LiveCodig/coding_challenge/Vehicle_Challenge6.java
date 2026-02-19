package LiveCodig.coding_challenge;
/*
Vehicle Inheritance Hierarchy
Create a Vehicle base class with start() method. Create Car and Bike subclasses that override the start() method.

Examples:
Input:
Vehicle[] vehicles = {new Car(), new Bike()}; call start() on each
Output:
Car engine starts with a roar! Bike engine starts with a purr!
💡 Explanation:Demonstrate runtime polymorphism where the actual method called depends on the object type, not the reference type.

 */

// Base class
public class Vehicle_Challenge6 {
    public void start(){
        System.out.println("Vehicles starts ");
    }
}
//Subclass 1
class Car extends Vehicle_Challenge6{
@Override
    public void start(){
    System.out.println("Car engine starts with a roar!");
}

}
//Subclass 2
class Bike  extends Vehicle_Challenge6{
    @Override
    public void start(){
        System.out.println("Bike engine starts with a purr!");
    }

}
// Main class
class VehicleTest{
    static void main(String[] args) {
        Vehicle_Challenge6[] vehicles={new Car(), new Bike()};
        for (Vehicle_Challenge6 v:vehicles){
            v.start();
        }
    }
}