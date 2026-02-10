package ex_27_Wrapper;

public class Lab223_Wrapper_Conversion {
    static void main(String[] args) {
        String num="10";
        int aa=10;

        //String to Integer Warpper conversion
        Integer a =Integer.parseInt(num);
        System.out.println(a);
        //Double.parseDouble(num);
        //Float.parseFloat(num);
        //Long.parseLong(num);

        //String to primitive
        int strToInt=Integer.parseInt(num);
        Integer aa3=Integer.valueOf("10");
        System.out.println(aa3);

        int a1=10;
       // a.   //dont have any attribute for primitive
       // a.len();//dont have any method
        System.out.println(a);

        //but the moment we use wrapper class have different method and attributes
        Integer aa1=10;
        System.out.println(aa);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
