package ex_16_Arrays;

import java.util.Arrays;

public class Lab155_Arrays_MaxMin {
    static void main(String[] args) {
        int[] marks = {51, 22, 83, 94, 75, 86};
        //Using in built function-find max number
        Arrays.sort(marks);//always default ascending
        System.out.println(marks[marks.length - 1]);

        //without using in built function-max
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println(max);

        //without using in built function-min
        int min = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println(min);
    }


}

