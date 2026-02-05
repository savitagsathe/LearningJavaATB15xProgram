package ex_23_OOPS_superAbstraction.Abstraction;

public class Lab201_Interview_Q {

}

//Can we have interface like this?=>yes
interface I11{}
interface I12{}

//Can we have class like this?=>yes
class A1{}
class B1{}

//class Test2 extends A1,B1{} =>multiple inheritance not allowed for class
//is it possible?
class Test3 implements I11{}
class Test4 implements I11,I12{}  //multiple inheritance with interface
class Test5 extends A1 implements I11,I12{}

//class Test5 implements I11 extends A{}

//interface I3 extends A1{}


