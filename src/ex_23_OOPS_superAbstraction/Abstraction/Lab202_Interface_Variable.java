package ex_23_OOPS_superAbstraction.Abstraction;

public class Lab202_Interface_Variable {

}
interface Pramod{
   int a =10;
   String notes="Java notes";
   void display();

}
class Datta implements Pramod{
    int aa=10;
    public void display(){
        System.out.println(a);//interface variables use directly
        System.out.println(this.aa);
    }
}
class Somya implements Pramod{
    @Override
    public void display(){
        System.out.println(notes);
    }
}

//interface B{
//
//}
//interface A implements B{//one interface cant implement another interface
//
//}