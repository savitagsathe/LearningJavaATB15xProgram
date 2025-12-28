package ex_05_type_casting;

public class Lab061_Typecasting_Used {
    public static void main(String[] args) {
        int course=100;
        float NSRT_GST=18.45f;
       // int total=course+NSRT_GST;//Narrowing implicit
        //int total=course+(int)NSRT_GST;//Narrowing explicit
        //System.out.println(total); here we are loosing .45

        float total2=course+NSRT_GST;//widening implicit
        float total3=(float) course+NSRT_GST;//widening explicit//not required by default allowed
        System.out.println(total3);

    }
}
