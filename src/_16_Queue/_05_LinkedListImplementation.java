package _16_Queue;
public class _05_LinkedListImplementation {
    public static class Node {
        Node next ;
        int val ;
        Node(int val ){
            this.val = val;
        }
    }
    public static class Queue {
        private Node head = null ;
        private Node tail = null ;
        private int size = 0 ;

        void add(int ele){
            Node temp = new Node(ele);

            if( size == 0){
                head = tail = temp ;
                size = 1 ;
                return ;
            }

            tail.next = temp ;
            tail = temp ;
            size++ ;
        }

        int peek(){
            if( size == 0) {
                System.out.println("Queue is empty ");
                return -1 ;
            }
            return head.val;
        }

        int remove(){
            if( size == 0) {
                System.out.println("Queue is empty ");
                return -1 ;
            }
            int val = head.val ;
            head = head.next ;
            size-- ;
            return val ;
        }

        boolean isEmpty(){
            if(size == 0) return true ;
            return false ;
        }

        void display(){
            Node temp = head ;
            while( temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next ;
            }
            System.out.println();
        }

        int size(){
            return size ;
        }

    }
    static void main(String[] args) {

        Queue que = new Queue();
        System.out.println("is queue empty : "+que.isEmpty());
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.display();
        System.out.println("elements removed : "+ que.remove());
        System.out.println("elements removed : "+ que.remove());
        System.out.println("elements at top is  : "+ que.peek());
        System.out.println("size of queue is : "+que.size());
        System.out.println("is queue empty : "+que.isEmpty());
        que.display();
    }
}
