package ex_24_static;

public class Lab204_static_p2 {

}
class ATB {
    int phone_no;
    String name;


    //static variable
    static  String course_name="15x";
//static method
    static void markAttendence(){
        System.out.println("mark Attendence");
//static function cannot use nonstatic variable
// System.out.println(this.phone_no);
    }
    void  display(){
        System.out.println(this.phone_no+this.name+course_name);
    }
//static class
    static class A{

    }
}

