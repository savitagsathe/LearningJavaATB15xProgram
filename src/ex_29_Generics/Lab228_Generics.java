package ex_29_Generics;

public class Lab228_Generics {
    static void main(String[] args) {
       temp_sum(2,3);
        temp_sum("abc","xyz");//we cant call string to Integer method so we created another integer method
    }
//    static void temp_sum(Integer a, Integer b){
//        System.out.println(a);
//        System.out.println(b);
//
//    }
//    static void temp_sum(String a, String b){
//        System.out.println(a);
//        System.out.println(b);
//
//    }
    //instaed of creating above two seprate method we can creat 1 and call for any type generics means any data type it can hold

    static<T> T temp_sum(T a,T b){//instead of T name can be anything.T means template
        System.out.println(a);
        System.out.println(b);
        return  null;
    }
}
