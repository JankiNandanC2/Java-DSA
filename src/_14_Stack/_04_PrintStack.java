package _14_Stack;

import java.util.Stack;

public class _04_PrintStack {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        // directly print
        System.out.println(st);
        // using loop -- but it removes elements from stack
        while( ! st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
