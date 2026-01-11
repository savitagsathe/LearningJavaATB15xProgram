package ex_07_switchcase;

public class Lab094_switch_interview6 {
    static void main(String[] args) {
        //what is the output for this?=>output 10
       int a=11;

        switch (-1){
            default:System.out.println("default");
                break;
            case -1:
                System.out.println("10");
            break;
            
            case 9:System.out.println("9");
            break;



        }
    }
}