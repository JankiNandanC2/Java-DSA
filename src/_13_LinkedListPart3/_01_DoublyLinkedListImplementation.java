package _13_LinkedListPart3;
class Node{
    int val ;
    Node next ;
    Node prev ;
    Node(int val ){
        this.val = val ;
    }
}
class DLL{
    Node head ;
    Node tail ;
    int size ;
    void display(){
        Node temp = head ;
        while (temp != null ){
            System.out.print(temp.val +" ");
            temp = temp.next ;
        }
        System.out.println();
        System.out.println("Size Of List: "+ size);
    }
    void InsertATTail(int val){
        Node temp = new Node(val) ;
        // if list is empty i.e size == 0
         if(tail == null ){
             head = tail = temp ;
        }
        else {
             tail.next = temp ;
             temp.prev = tail ;
             tail = temp ;
        }
        size++ ;
    }
    void InsertAtHead(int val){
        Node temp = new Node(val) ;
        // if list is empty
         if( head == null ){
             head = tail = temp ;
        }
        else {
             temp.next = head ;
             head.prev = temp ;
             head = temp ;
        }
        size++ ;
    }
    void Insert(int indx , int val ){
        if(indx == 0 ) {
            InsertAtHead(val);
            return ;
        }
        if(indx == size ) {
            InsertATTail(val);
            return ;
        }
        if(indx > size) {
            System.out.println("Invalid Index ");
            return;
        }
        Node temp = new Node(val);
        int i = 0; // 0 based indexing
        Node t1 = head ;
        while ( i < indx - 1){
            t1 = t1.next ;
            i++ ;
        }
        Node y = t1.next ;
        temp.next = y  ;  y.prev = temp ;
        t1.next = temp ; temp.prev = t1 ;
        size++ ;
    }
    void deleteAtHead() throws Error{
        if(head == null ) throw new Error("empty list ");
        head = head.next ;
        head.prev = null ;
        size-- ;
    }
    // delete at tail ----> brand-new feature of dll
    void deleteAtTail() throws Error{
        if(tail == null ) throw new Error("empty list");
        tail = tail.prev ;
        tail.next = null ;
        size-- ;
    }
    void delete(int indx){
        if(indx == 0 ) {
            deleteAtHead();
            return ;
        }
        if(indx == size - 1 ) {
            deleteAtTail();
            return ;
        }
        if(indx >= size) {
            System.out.println("Invalid Index ");
            return;
        }
        Node temp = head ;
        int i = 0 ;
        while(i < indx-1){
            temp = temp.next ;
            i++ ;
        }
        Node y =  temp.next.next ;
        temp.next = y ;
        y.prev = temp ;
        size-- ;
    }
}
public class _01_DoublyLinkedListImplementation {
    public static void print(Node head ){
        Node temp = head ;
        while (temp != null ){
            System.out.print(temp.val +" ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static void printReverse(Node tail ){
        Node temp = tail ;
        while (temp != null ){
            System.out.print(temp.val +" ");
            temp = temp.prev ;
        }
        System.out.println();
    }
    public static void display(Node node ){
        // first find the head
        Node temp = node ;
        while (temp.prev != null ) temp = temp.prev ;
        // now print the list
        while (temp != null ){
            System.out.print(temp.val +" ");
            temp = temp.next ;
        }
        System.out.println();
    }
    static void main(String[] args) {
        /*
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.prev = null ;
        a.next = b ; b.prev = a ;
        b.next = c ; c.prev = b ;
        c.next = d ; d.prev = c ;
        d.next = null ;
        System.out.print("List : ");
        print(a);
        System.out.print("Reversed List : ");
        printReverse(d);
        // to print list using any given node
        System.out.println("List print using any node : ");
        display(b);
         */
        DLL list = new DLL();
        // InsertATTail
        list.InsertATTail(90);
        list.InsertATTail(100);
        list.InsertATTail(110);
        list.InsertATTail(120);
        list.display();

        // InsertAtHead
        list.InsertAtHead(50);
        list.InsertAtHead(40);
        list.InsertAtHead(30);
        list.InsertAtHead(20);
        list.InsertAtHead(10);
        list.display();

        // Insert At any specific index
        list.Insert(5,60);
        list.Insert(6,70);
        list.display();
        list.Insert(11,800); // tail
        list.display();
        list.Insert(11,700); // before tail
        list.display();

        // delete at head
        System.out.println("delete At head");
        list.deleteAtHead();
        list.display();
        System.out.println("Delete At Tail ");
        list.deleteAtTail();
        list.display();
        System.out.println("delete a specific index ");
        list.delete(5);
        list.display();
        list.delete(9);
        list.display();

         // *****
        // homework - create get values  method and set values method
    }
}
