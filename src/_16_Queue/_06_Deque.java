package _16_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class _06_Deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(9);
        dq.offerFirst(8);
        dq.addFirst(99);
        dq.addLast(88);

        dq.pollFirst();
        dq.pollLast();
        dq.removeFirst();
        dq.removeLast();

        dq.offerLast(9);
        dq.offerFirst(8);
        dq.addFirst(99);
        dq.addLast(88);

        dq.getFirst();
        dq.getLast();


        dq.peekLast();
        dq.peekFirst();
    }
}
