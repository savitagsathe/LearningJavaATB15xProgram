package ex_23_OOPS_superAbstraction.Abstraction;



public class Lab196_Abcstraction {
    public static void main(String[] args) {
       Son s1=new Son();
       s1.loan50k();
       s1.loan10k();
    }

}
abstract class Father{
    abstract void loan50k();

    //concrete-complete method
    void loan10k(){
        System.out.println("Given!");
    }
}
class Son extends Father{

    @Override
    void loan50k() {
        System.out.println("Given by son!!");
    }
}