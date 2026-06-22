package _16_Queue;

public class _07_DequeImplementationUsingDoublyLinkedList {
    static class Node{
        int data ;
        Node prev , next ;
        Node(int data ){
            this.data = data ;
        }
    }
    static class Deque{
        Node front ;
        Node rear ;
        int size ;

        Deque(){
            front = null ;
            rear = null ;
            size = 0 ;
        }

        public int getFront() {
            return front.data;
        }

        public int getRear() {
            return rear.data;
        }

        boolean isEmpty(){
            if( size == 0 ) return true ;
            return  false ;
        }

        int size(){
            return size ;
        }

        public void insertFront(int data ) {
            Node newNode = new Node(data) ;
            if(front == null ){
                front = rear = newNode ;
            }
            else {
                newNode.next = front ;
                front.prev = newNode ;
                front = newNode ;
            }
            size++ ;
        }

        public void insertRear(int data ) {
            Node newNode = new Node(data) ;
            if(rear == null ){
                front = rear = newNode ;
            }
            else {
                rear.next = newNode ;
                newNode.prev = rear ;
                rear = newNode ;
            }
            size++ ;
        }

        public void deleteFront(){
            if( size == 0 ) {
                System.out.println(" underflow cond ");
                return ;
            }
            Node temp = front ;
            front = front.next ;
            if( front == null ) rear = null ;
            else front.prev = null ;
            size-- ;
        }

        public void deleteRear(){
            if( size == 0 ) {
                System.out.println(" underflow cond ");
                return ;
            }
            Node temp = rear ;
            rear = rear.prev ;
            if( rear == null ) front = null ;
            else rear.next = null ;
            size-- ;
        }

        public void display(){
            Node temp = front ;
            while( temp != null) {
                System.out.print(temp.data +" ");
                temp = temp.next ;
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        Deque dq = new Deque();
        dq.insertFront(1);
        dq.insertFront(2);
        dq.insertFront(3);

        dq.display();

        dq.insertRear(1);
        dq.insertRear(2);
        dq.insertRear(3);

        dq.display();

        System.out.println("is empty ? "+dq.isEmpty());
        System.out.println("size of deque is " + dq.size());
        System.out.println("front is " + dq.getFront());
        System.out.println("rear is " + dq.getRear());
    }
}
