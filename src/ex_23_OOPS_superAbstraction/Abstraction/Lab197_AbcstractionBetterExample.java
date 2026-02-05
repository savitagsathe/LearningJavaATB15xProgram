package ex_23_OOPS_superAbstraction.Abstraction;



public class Lab197_AbcstractionBetterExample {
    public static void main(String[] args) {
       Alto car=new Alto();
       car.drive();


    }

}
abstract class Car1{
    abstract void start();
    abstract void stop();
}
class Alto extends Car1{

void drive(){
    start();
    System.out.println("We are driving a car");
    stop();
}

    @Override
    void start() {
        System.out.println("Starting a car");
    }

    @Override
    void stop() {
        System.out.println("Stoping a car");
    }
}