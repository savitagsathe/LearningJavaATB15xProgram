package LiveCodig.coding_challenge;
/*
    Abstract Shape Implementation
Implement an abstract class "Shape" with an abstract method "getArea()". Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.

Examples:
Input:
Rectangle: length=5, width=3; Circle: radius=4
Output:
Rectangle Area: 15.0 Circle Area: 50.26548245743669
💡 Explanation:Abstract classes cannot be instantiated but can define common behavior. Subclasses must implement all abstract methods.
  */

// Abstract class
public abstract class Shape_Challenge8 {
    // Abstract method (no body)
    public abstract double getArea();
}

// Rectangle subclass
class Rectangle extends Shape_Challenge8{
private double width;
private double length;

public Rectangle(double length,double width){
this.length=length;
this.width=width;
}

@Override
public double getArea(){

    return length*width;
}

}
class Circle extends Shape_Challenge8{
    double radius;
Circle(double radius){
    this.radius=radius;
}

@Override
    public double getArea(){
    return Math.PI*radius*radius;
}
}
class TestShape{
    static void main(String[] args) {
        Shape_Challenge8 rect=new Rectangle(5,3);
        System.out.println( "Rectangle Area: "+rect.getArea());

        Shape_Challenge8 cir=new Circle(4) ;
        System.out.println("Circle Area: "+cir.getArea());
    }
}