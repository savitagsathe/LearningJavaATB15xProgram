package ex_01_java_Task;

public class Interview_26DECTask__Incre_Decre {
    public static void main(String[] args) {
        //Que1
        int a=10;
        a = a++ + a++ + a++;//10+11+12
        System.out.println(a);//33

        //Que2
        int a1 = 3;
        // Evaluation: 10 (a becomes 11) + 11 (a becomes 12) + 12 (a becomes 13)
       int b = a1++ * ++a1;
       System.out.println(b);//15

        //Que3
        int a2 = 5;
        // Evaluation: 5 (a becomes 6) + 6 (a becomes 5)
        System.out.println(a2++ + a2--);//11
    }
}
