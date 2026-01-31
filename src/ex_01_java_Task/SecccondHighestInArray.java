package ex_01_java_Task;

public class SecccondHighestInArray {
    public static void main(String[] args) {
        //SecondHighestInArray : int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34  o/p → 34
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int largest = 0;
        int secondLargest =0;

        for (int num:numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num >secondLargest  && num!= largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second largest number in array is:" + secondLargest);
    }
}
