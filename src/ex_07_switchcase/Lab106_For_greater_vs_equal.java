package ex_07_switchcase;

public class Lab106_For_greater_vs_equal {
    static void main(String[] args) {
//output: 0 to 10

//        for (int i=0;i<=10;i++){
//            System.out.println(i); //output: 0 to 10, 11 times
//        }
        for (int i=1;i<=10;i++){
            System.out.println(i); //output: 1 to 10 ,10 times
        }

//        for (int i=0;i<10;i++){
//            System.out.println(i); //output: 0 to 9, 10 times
//        }
        for (int i=0;i<10;++i){
            System.out.println(i); //output: 0 to 9 ,10 times
        }
    }
}
