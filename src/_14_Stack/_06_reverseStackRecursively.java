package _14_Stack;

import java.util.Stack;

public class _06_reverseStackRecursively {
    public static void displayReverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverse(st);
        st.push(top);
    }
    public static void displayOriginalOrder(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        displayOriginalOrder(st);
        System.out.print(top+" ");
        st.push(top);
    }
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("original stack : "+st);
        System.out.print("reversed stack print using recursion :: ");
        displayReverse(st);
        System.out.println();
        System.out.print("print in same order using recursion :: ");
        displayOriginalOrder(st);
    }
}
