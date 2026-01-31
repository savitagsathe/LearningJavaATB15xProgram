package ex_16_Arrays;

public class Lab158_SumOfArrayIQ {
    static void main(String[] args) {
        int [] numbers={5,8,9};
        int sum=0;

        for (int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];

        }
        System.out.println(sum);
    }
}
