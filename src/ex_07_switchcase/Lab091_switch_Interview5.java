package ex_07_switchcase;

public class Lab091_switch_Interview5 {
    static void main(String[] args) {
        //can we have 2 cases with the same value? =>no duplicate case not allowed
       int a=98;
        switch (a){
            case 98://Error: Duplicate label '98'
                System.out.println("98");
            //case 98:
                System.out.println("98");

        }
    }
}