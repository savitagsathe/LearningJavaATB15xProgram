package ex_07_switchcase;

public class Lab092_switch_JDK13above {
    static void main(String[] args) {
        //JDK13above new feature arrow is used instead of break stmt
       int itemcode=002;

        switch (itemcode){
            case 001->System.out.println("001");
            case 002->System.out.println("002");
            case 003->System.out.println("003");
            default->System.out.println("default");

        }
    }
}