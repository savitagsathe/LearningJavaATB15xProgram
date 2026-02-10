package ex_26_Enum;

public class Lab218_ENUM {
    static void main(String[] args) {
        enum_Day today=enum_Day.MONDAY;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());//zero index policy


    }
}
