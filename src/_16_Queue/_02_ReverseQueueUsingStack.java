package _16_Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class _02_ReverseQueueUsingStack {
    public static void reverse(Queue<Integer> que){
        Stack<Integer> st = new Stack<>();
        while( ! que.isEmpty()){
            st.push( que.poll() );
        }
        // now copy from stack to queue
        while( ! st.isEmpty()){
            que.add( st.pop() );
        }
    }
    static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        System.out.println("queue empty ? : " +que.isEmpty());
        System.out.println("size of queue is :"+ que.size());
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println("Original queue : "+que);
        //reverse using stack
        reverse(que);
        System.out.println("Reversed Queue : "+que);
    }
}
