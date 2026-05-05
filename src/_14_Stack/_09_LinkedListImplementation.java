package _14_Stack;
class Node{
    int val ;
    Node next ;
    Node(int val ){
        this.val = val ;
    }
}
class stack{
    private Node head = null ;
    private int size = 0 ;
    void push(int x ){
        Node temp = new Node(x);
        if(isEmpty()) {
            head = temp ;
            size++ ;
            return;
        }
        temp.next = head ;
        head = temp ;
        size++ ;
    }
    int pop(){
        if(isEmpty()) {
            System.out.println("empty Stack");
            return -1 ;
        }
        int val = head.val ;
        head = head.next ;
        size-- ;
        return val ;
    }
    int peek(){
        if(isEmpty()) {
            System.out.println("empty Stack");
            return -1 ;
        }
        return head.val ;
    }
    boolean isEmpty(){
        if(size == 0) return  true ;
        return false ;
    }
    void display(){
        if (isEmpty()) return;
        Node temp = head ;
        displayRecursively(temp);
        System.out.println();
    }
    void displayRecursively(Node temp){
        if(temp == null) return;
        displayRecursively(temp.next);
        System.out.print(temp.val+" ");
    }
    int size(){
        return size ;
    }
}
public class _09_LinkedListImplementation {
    static void main(String[] args) {
        stack st = new stack();
        System.out.println("is empty : "+st.isEmpty());
        st.display();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println("size : "+st.size());
        System.out.println("top element  : "+st.peek()); // top element
        st.pop();
        st.display();
        System.out.println("is empty : "+st.isEmpty());
        st.push(50);
        st.push(60);
        st.display();
    }
}
