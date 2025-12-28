package ex_05_type_casting;

public class Lab062_Typecasting_Extra_ExampleChar {
    public static void main(String[] args) {
        char ch='A';
        int ascii=ch;//widening

        int num=66;//narrow
        char letter=(char)num;

    }
}
