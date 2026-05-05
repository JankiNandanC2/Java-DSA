package _14_Stack;

import java.util.Stack;

public class _02_ReverseStack {
    static void main(String[] args) {
        Stack<Integer> stOriginal = new Stack<>();
        stOriginal.push(10);
        stOriginal.push(20);
        stOriginal.push(30);
        stOriginal.push(40);
        System.out.println("Original Stack : "+stOriginal);
        Stack<Integer> stReversed = new Stack<>();
        while ( ! stOriginal.isEmpty()){
            // int element = stOriginal.pop();
            // stReversed.push(element);
            stReversed.push(stOriginal.pop());
        }
        System.out.println("Reversed Stack : "+ stReversed);
    }
}
