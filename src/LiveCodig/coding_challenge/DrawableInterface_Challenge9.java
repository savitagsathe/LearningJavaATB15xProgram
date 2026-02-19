package LiveCodig.coding_challenge;
/*
Drawable Interface Implementation
Create an interface "Drawable" with a method "draw()". Implement this interface in classes "Circle" and "Rectangle".

Examples:
Input:Create Circle and Rectangle objects, call draw() method
Output:Drawing a Circle Drawing a Rectangle

Explanation:Interfaces define contracts that implementing classes must follow. All methods in an interface are implicitly abstract.
 */
public interface DrawableInterface_Challenge9 {
    public void draw();
}

 class CircleI1 implements DrawableInterface_Challenge9{
public void draw(){
    System.out.println("Drawing a Circle ");
}
}
class RectangleI2 implements DrawableInterface_Challenge9{
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}

class TestDrawable{
    static void main(String[] args) {
        DrawableInterface_Challenge9 i=new CircleI1();
        i.draw();
        DrawableInterface_Challenge9 i2=new RectangleI2();
        i2.draw();
    }
}
