package ex_07_switchcase;

public class Lab088_switch_Interview2 {
    static void main(String[] args) {
        //what is the output? => Match ASCII
        char ch='A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No match");
        }
    }
}