package ex_27_Wrapper;

public class Lab225_IQ {
    static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a==b); // true(cached)

        Integer x = 200;
        Integer y = 200;
        System.out.println(x==y);  // false(non cached)
        System.out.println(x.equals(y));//use this after byte

//Java caches Integer values from -128 to 127, so `==` works for small numbers
        //but fails for larger ones. Always use `.equals()` for wrapper comparisons.

//        Integer num=null;//whenever doing conversion from wrapper to primitive make sure there should not be null value
//        int value=num;//NullPointerException
//        System.out.println(value);

//toString method use
        Integer aa=10;
        System.out.println(aa.toString());//this is string but looks like int
        System.out.println(aa.toString() instanceof String);// this method will check its string




    }
}
