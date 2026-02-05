package ex_24_static;

public class Lab203_Static {
    static void main() {
        Student s1=new Student(12);
        Student s2=new Student(10);
        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(s1.course_name);
        System.out.println(s2.course_name);
    }
}
class Student{
    int age;//non static /instnace variable
    static String course_name="atb15";

public Student(int age_c){
    this.age=age_c;
}}