package ex_26_Enum;

public class Lab219_ENUM_P2 {
    static void main(String[] args) {
        enum_Day today=enum_Day.FRIDAY;

        switch (today){
            case MONDAY -> System.out.println("Monday");
            case FRIDAY -> System.out.println("Friday");
        }
        System.out.println(API_URLS.valueOf("google"));
    }


}
