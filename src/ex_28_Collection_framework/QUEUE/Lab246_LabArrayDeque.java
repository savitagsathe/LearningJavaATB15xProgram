package ex_28_Collection_framework.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab246_LabArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(5);
        deck.push(1);
        System.out.println(deck);
    }
}
