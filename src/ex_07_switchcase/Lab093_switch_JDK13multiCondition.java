package ex_07_switchcase;

public class Lab093_switch_JDK13multiCondition {
    static void main(String[] args) {
        //JDK13above new feature arrow is used instead of break stmt
       int itemcode=002;

        switch (itemcode){
            case 001,002,004:System.out.println("All of them are electronics gadgets");
            break;

            case 003,005,006:System.out.println("This is Mech");
            break;

            default:System.out.println("None");
            break;

        }
    }
}