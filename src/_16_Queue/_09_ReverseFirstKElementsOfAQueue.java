package _16_Queue;

import java.util.ArrayDeque;
import java.util.Queue ;
import java.util.Scanner;
import java.util.Stack;

public class _09_ReverseFirstKElementsOfAQueue {
    public static void reverseFirstKElement(Queue<Integer> que , int k ){
        Stack<Integer> st = new Stack<>();
        int n = que.size() ;
        int i = k ;
        // poll first k elements from queue and push into stack
        while( i > 0  ){
            st.push( que.poll() );
            i-- ;
        }
        // now again pop it from stack and add to queue
        while( ! st.isEmpty()){
            que.offer( st.pop() );
        }

        // now remaining ( n- k ) elements poll and add it into queue
        i= n- k ;
        while( i > 0 ){
            que.offer( que.poll() ) ;
            i-- ;
        }
    }
    static void main(String[] args) {
        Queue<Integer> que  = new ArrayDeque<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
//        System.out.println("Enter value of k : ");
//        Scanner scan = new Scanner(System.in) ;
//        int k = scan.nextInt();
        int k = 4 ;

        System.out.println("before reverse :  "+que);
        reverseFirstKElement(que , k);
        System.out.println("reversing first k element : "+que);
    }
}
