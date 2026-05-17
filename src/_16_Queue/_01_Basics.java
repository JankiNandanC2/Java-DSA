package _16_Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _01_Basics {
    public static void print(Queue<Integer> que ){
        Queue<Integer> helper = new ArrayDeque<>();
        System.out.println("print Queue without using default print option");
        while( ! que.isEmpty()){
            int val = que.remove();
            helper.add(val);
            System.out.print(val +" ");
        }
        // now copy back the elements to its original queue
        while( ! helper.isEmpty()){
            que.add( helper.remove());
        }
    }
    static void main(String[] args) {
//        Queue<Integer> que = new Queue<>(); // java: java.util.Queue is abstract; cannot be instantiated

        // Declaration and instantiation
        Queue<Integer> que2 = new LinkedList<>();
        Queue<Integer> que = new ArrayDeque<>();
        System.out.println("queue empty ? : " +que.isEmpty());
        System.out.println("size of queue is :"+ que.size());
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);

        // to remove elements
        System.out.println(que.remove());
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);

        System.out.println("peek element of queue is :  "+ que.peek());
        System.out.println("size of queue is : "+ que.size());
        System.out.println(que);
        System.out.println("queue empty ? : " +que.isEmpty());


        // print Queue without using default print option
        // print using stl like peek()poll() , remove() , size() , add()
        print( que ); // without inbuilt
        System.out.println();
        System.out.println(que);


    }
}
