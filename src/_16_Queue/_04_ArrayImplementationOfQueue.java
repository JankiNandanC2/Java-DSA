package _16_Queue;

public class _04_ArrayImplementationOfQueue {
    public static class Queue{
        private int front = -1 ;
        private int rear = -1 ;
        private int size = 0 ;
        int[] arr = new int[5];
        void add(int ele ){
            if( size == 0 && rear == -1  ){
                front = 0 ; rear = 0 ;
                arr[rear++] = ele ;
                size = 1  ;
                return ;
            }
            if( rear == arr.length ){
                System.out.println("Queue is full ");
                return ;
            }
            arr[rear++] = ele ;
            size++ ;
        }
        int peek(){
            if(  size == 0  ) {
                System.out.println("element cant be remove :- empty queue");
                return -1 ;
            }
            int val = arr[front];
            return val ;
        }

        int remove(){
            if(  size == 0  ) {
                System.out.println("element cant be remove :- empty queue");
                return -1 ;
            }
            int val = arr[front];
            front += 1 ;
            size-- ;
            return val ;
        }
        int size(){
            return size ;
        }
        boolean isEmpty(){
            if( size == 0 ) return true ;
            return false ;
        }
        void print(){
            if( size == 0) {
                System.out.println("Queue cant be displayed :- queue is empty ");
                return;
            }
            for(int i = front   ; i < rear ; i++ ){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        Queue que = new Queue();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);

        que.print();

        System.out.println("elements removed : "+ que.remove());
        System.out.println("elements removed : "+ que.remove());
        System.out.println("elements at top is  : "+ que.peek());
        System.out.println("size of queue is : "+que.size());
        System.out.println("is queue empty : "+que.isEmpty());
        que.print();
    }
}
