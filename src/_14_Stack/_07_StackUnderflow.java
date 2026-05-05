package _14_Stack;

import java.util.Stack;

public class _07_StackUnderflow {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.pop();
        /*
         java.util.EmptyStackException
	at java.base/java.util.Stack.peek(Stack.java:103)
	at java.base/java.util.Stack.pop(Stack.java:85)
	at _14_Stack._07_StackUnderflow.main(_07_StackUnderflow.java:10)
         */
    }
}
