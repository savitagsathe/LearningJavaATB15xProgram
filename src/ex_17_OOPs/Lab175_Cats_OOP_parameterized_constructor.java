package ex_17_OOPs;

public class Lab175_Cats_OOP_parameterized_constructor {
    public static void main() {
       Cat c1=new Cat();
       Cat c2=new Cat("myfasa");
        Cat c3=new Cat("luccy");
        Cat c4=new Cat("spicy");
        Cat c5=new Cat("oggy");


    }
}

class Cat{
    String name;
    Cat(){
        System.out.println("DC");
    }
    Cat(String nameGiven){
   this.name=nameGiven;
    }
}