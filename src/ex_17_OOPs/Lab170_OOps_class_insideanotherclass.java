package ex_17_OOPs;

public class Lab170_OOps_class_insideanotherclass {
    static void main(String[] args) {
        Lab169_Person p=new Lab169_Person();//other class object created here
        p.name="savita";

        Lab169_Person p1=new Lab169_Person();
        p1.name="sathe";

        //two separate objects will get created in heap memory

        Lab169_Person p2=new Lab169_Person();
        p1.name="sathe";//if content same still new onject will get created in heap

        Lab169_Person p3; //Object will not get created its null area

        new Lab169_Person();//this is object get created wih no reference like son is present but we cant find where it is

    }
}
