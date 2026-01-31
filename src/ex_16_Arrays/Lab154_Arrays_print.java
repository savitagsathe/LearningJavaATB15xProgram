package ex_16_Arrays;

public class Lab154_Arrays_print {
    static void main(String[] args) {
        int[] marks={51,22,83,94,75,86};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println("=======================");

        //above is not the best way to print the value of array
        for (int item:marks){
            System.out.println(item);
        }
        System.out.println("=======================");
             for (int i=0;i<marks.length;i++) {
                 System.out.println(marks[i]);
             }

    }



    }

