package ex_23_OOPS_superAbstraction.Abstraction;

public class Lab198_Interface_p1 {
    static void main(String[] args) {
        Car2 car=new Car2();
        car.drive();

    }

}
class Car2 implements brakes,Engine1{
void drive(){
    applyBreak();
    testEngine();
    stopEngine();
    startEngine();
    Engine1.testEngineStatic();

}

    @Override
    public void startEngine() {
        System.out.println("startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stopEngine");
    }

    @Override
    public void testEngine() {
        Engine1.super.testEngine();
    }


    @Override
    public void aplyBreak() {
        System.out.println("Applied break");
    }

    @Override
    public void applyBreak() {
        System.out.println("applyBreak");
    }
}

interface brakes {
    void aplyBreak();
/*Complete function are not allowed in interface
void applyBreak2(){

}*/

    //only using default and static its alowed complete function
    default void applyBreak() {
        System.out.println("applyBreak");
    }

    static void applyBreak1() {
        System.out.println("applyBreak1");
    }



}

interface Engine1 {
    void startEngine();

    void stopEngine();

    default void testEngine() {
        System.out.println("Concrete default");
    }

    static void testEngineStatic() {
        System.out.println("Concrete static");
    }
}