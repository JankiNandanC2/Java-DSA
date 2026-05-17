package _16_Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class _03_Basics2 {
    public static void removeEvenIndx(Queue<Integer> que ){
        Queue<Integer> helper = new ArrayDeque<>() ;
        /*
        int indx = 0 ;
        while( ! que.isEmpty()){
            int val = que.poll();
            if(indx % 2 != 0 ) helper.add(val);;
            indx++ ;
        }
         */

        while( ! que.isEmpty()){
             que.poll(); // even index pop
            if ( ! que.isEmpty()) helper.add(que.poll()) ; // odd index stored
        }

        // now copy the odd based valur to original queue
        while( ! helper.isEmpty()){
            que.add(helper.poll());
        };
    }
    static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(1); // indx 0
        que.add(2);
        que.add(3); // indx 2
        que.add(4);
        que.add(5); // indx 4

        // remove elements at even index
        System.out.println("Before removal : "+que);
        removeEvenIndx(que);
        System.out.println("After Removal : "+ que);
    }
}
