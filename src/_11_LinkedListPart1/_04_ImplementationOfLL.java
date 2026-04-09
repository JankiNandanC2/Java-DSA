package _11_LinkedListPart1;

class SLL{ // singli LinkedList
    private Node head ;
    private Node tail ;
    private int size ;
    public void InsertAtTail(int val){
        Node temp = new Node(val);
        // case 1 if linkedList is empty
        if(head == null){
            // head = tail = temp ;
            head = temp ;
            tail = temp ;
        }
        else{
            tail.next = temp ;
            tail = temp ;
        }
        size++ ;
    }
    public void InsertAtHead(int val){
        Node temp = new Node(val);
        // case 1 if linkedList is empty
        if(head == null){
             head = tail = temp ;
        }
        else{
            temp.next = head ;
            head = temp ;
        }
        size++ ;
    }
    public void display(){
        Node temp = head ;
        while( temp != null ){
            System.out.print(temp.val+" ");
            temp = temp.next ;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Length of linkedList : "+size);
    }
}
public class _04_ImplementationOfLL { // ImplementationOfLInkedList
    static void main(String[] args) {
        // creation of linked list
        SLL  list = new SLL();
        list.size();
// Insert at end / tail
        list.InsertAtTail(10); // insert at last/ end
        list.InsertAtTail(20);
        list.InsertAtTail(30);
        list.InsertAtTail(40);
        list.display();
        list.size();
        list.InsertAtTail(99);
        list.display();
        list.size();
// insert at Head
        list.InsertAtHead(200);
        list.InsertAtHead(300);
        list.InsertAtHead(400);
        list.display();
        list.size();
    }
}
