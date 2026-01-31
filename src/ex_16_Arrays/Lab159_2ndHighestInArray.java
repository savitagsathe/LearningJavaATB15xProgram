package ex_16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab159_2ndHighestInArray {
    static void main(String[] args) {
        int [] numbers={12,34,5,8,9};
        //in built function-2ndHighestInArray
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

        //without using in built function -2ndHighestInArray
    }
}
