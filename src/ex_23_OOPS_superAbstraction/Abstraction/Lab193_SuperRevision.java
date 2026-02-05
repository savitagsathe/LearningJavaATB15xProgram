package ex_23_OOPS_superAbstraction.Abstraction;

public class Lab193_SuperRevision {

}
class Vehicle{
    public int maxSpeed=180;

     Vehicle(){
        System.out.println("Default Constructor");
    }
    Vehicle(int a){
        System.out.println("param const..");
    }
    Vehicle(int a ,int b){
        System.out.println("No return,no Argument");
    }
    //Method overloading-Same function name with different argument
    void message(){
        System.out.println("No retun,No argument");
    }
    void message(int a){
        System.out.println("method with argumnet");
    }
    void drive(){
        System.out.println("Vehicle parent");
    }

    void noTest(){
        System.out.println("Empty!!");
    }

}

class Car extends Vehicle{
private int maxSpeed=181;
Car(){
    super(100);
}
Car(int a){
    System.out.println("PC Car");
}
void test(){

}
void drive(){
    super.drive();
    this.test();
    super.noTest();
}
}