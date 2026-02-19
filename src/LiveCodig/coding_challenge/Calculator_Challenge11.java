package LiveCodig.coding_challenge;
/*
Calculator Method Overloading
Write a program to demonstrate method overloading by creating multiple "add" methods with different parameters.

Examples:
Input:
add(5, 3), add(2.5, 3.7), add(1, 2, 3)
Output:
Integer addition: 8 Double addition: 6.2 Three integers addition: 6
💡 Explanation:Method overloading allows multiple methods with the same name but different
 */

public class Calculator_Challenge11 {
    static void main(String[] args) {
        Calculator_Challenge11 calc=new Calculator_Challenge11();
        System.out.println("Integer addition: "+ calc.add(5, 3));

        System.out.println("Three integers addition:"+calc.add(1, 2, 3));
        System.out.println("Double addition:"+calc.add(2.5, 3.7));
    }
public int add(int a,int b){

    return a+b;
}
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
}
