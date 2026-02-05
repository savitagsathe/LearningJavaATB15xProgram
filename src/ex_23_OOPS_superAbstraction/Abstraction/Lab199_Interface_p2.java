package ex_23_OOPS_superAbstraction.Abstraction;

public class Lab199_Interface_p2 {

}
interface F1{
    void icm1();
    void money();

}
interface F2{
    void money();
}
class Sonn implements F1,F2{

    @Override
    public void icm1() {

    }

    @Override
    public void money() {
        System.out.println("Son method");
    }
}
abstract class Mother {
void money(){
    System.out.println("Mother method");
}
}
class Son1 extends Mother implements F1,F2{

    @Override
    public void icm1() {

    }

    @Override
    public void money() {
        System.out.println("Son method");
    }
}