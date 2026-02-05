package ex_23_OOPS_superAbstraction.Abstraction;

public class Lab200_Multiple_Inheritance_solved {

}
class Child   implements Father1,Father2 {
    @Override
    public void money(){
        System.out.println("Child money!!");
    }
}
interface Father1{
    final int a=10;
    void money();

}
interface Father2{
    void money();
}