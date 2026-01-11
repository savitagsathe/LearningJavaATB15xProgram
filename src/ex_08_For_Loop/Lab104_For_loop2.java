package ex_08_For_Loop;

public class Lab104_For_loop2 {
    static void main(String[] args) {
//we can use flot and long also in for loop=>we can but rarely used
        for (long i = 1l; i<10;i++) {
            System.out.println("i");//output: infinite loop

        }
        for (float f = 0.0f; f<10.67;f++) {
            System.out.println("hi float->"+f);//output: infinite loop

        }
    }
}
