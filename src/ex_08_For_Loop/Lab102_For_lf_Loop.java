package ex_08_For_Loop;

public class Lab102_For_lf_Loop {
    static void main(String[] args) {

        for (int savi = 0;savi<18 ;savi++) {
            if(savi>15) {
                System.out.println("Gift from papa,iphone 99");//output: infinite loop
            }else {
                System.out.println("No gift yu are a KID");
            }
        }
    }
}
