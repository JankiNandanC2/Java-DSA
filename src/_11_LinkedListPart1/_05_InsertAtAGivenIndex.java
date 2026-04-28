package _11_LinkedListPart1;

class SinglyLinkedList{
    private Node head ;
    private Node tail ;
    private int size ;
    void Size(){
        System.out.println("Size of Linked List is : "+ size);
        System.out.println();
    }
    void display(){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next ;
        }
        System.out.println();
    }
    void InsertAtHead(int val){
        Node temp = new Node(val);
        if(head== null ) head = tail = temp ;
        else{
            temp.next = head ;
            head = temp ;
        }
        size++ ;
    }
    void InsertAtTail(int val){
        Node temp = new Node(val);
        if(head== null ) head = tail = temp ;
        else{
            tail.next = temp ;
            tail = temp ;
        }
        size++ ;
    }
    void InsertAtIndex(int indx , int val){
        if(indx == 0 ){  // insert at head
            InsertAtHead(val);
            return ;
            // temp.next = head ;
            //  head = temp ;
        }
        if (indx == size ){ // insert at tail
            InsertAtTail(val);
            return ;
            // tail.next = temp ;
            // tail = temp ;
        }
        if(indx > size || indx < 0 ) {
            System.err.println("Invalid Index");
            return;
        }
        Node temp = new Node(val);
        Node x = head ;
        //int i = 0 ;
        //while( i++ < indx - 1)  x = x.next ;
        // insertion at given index
        for(int i = 1 ; i <= indx -1 ; i++){
            x = x.next ;
        }
        temp.next = x.next ;
        x.next= temp ;
        size++ ;
    }
    int GetIndexElement(int indx ) throws Error {
        if(indx == 0 ) return head.val ;
        if(indx == size - 1 ) return tail.val ;
        if(indx < 0 || indx >= size ){
            throw new Error("bhAI iNDEX tO Shi De yaar ");
        }
        Node x = head ;
        int i = 1;
        while( i++ <= indx )  x = x.next ;
        return x.val ;
    }
    void SetIndexValue(int indx , int val) throws Error {
        if(indx == 0 ) {
            head.val = val ;
            return ;
        }
        if(indx == size - 1 ) {
            tail.val = val ;
            return ;
        }
        if(indx < 0 || indx >= size ){
            throw new Error("bhAI iNDEX tO Shi se de yaar ");
        }
        Node x = head ;
        int i = 1 ;
        while( i <= indx ) {
            x = x.next;
            i++ ;
        }
        x.val = val ;
    }
    void deleteAtHead() throws Error{
        if(head == null ) throw new Error("List is empty");
        head = head.next ;
        size-- ;
    }
    void deleteAtIndex(int indx ) throws Error{
        if(indx == 0){
            deleteAtHead();
            return ;
        }
        if(indx < 0 || indx >= size ){
            throw new Error("Invalid Index");
        }
        int i = 1;
        Node temp = head ;
        while(i  <= indx -1 ){
            temp = temp.next ;
            i++ ;
        }
        if(temp.next == tail ) {
            tail = temp ;
        }
        temp.next = temp.next.next ;
        size-- ;
    }
}
public class _05_InsertAtAGivenIndex {
    static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.InsertAtHead(10);
        list.InsertAtHead(9);
        list.InsertAtHead(8);
        list.InsertAtHead(7);
        list.InsertAtHead(5);
        list.display();
        list.Size();
        list.InsertAtTail(11);
        list.InsertAtTail(12);
        list.InsertAtTail(13);
        list.display();
        list.Size();
        list.InsertAtIndex(1,99);
        list.display();
        list.Size();
        list.InsertAtIndex(5,99);
        list.display();
        list.Size();
        list.InsertAtIndex(9,99);
        list.display();
        list.Size();
//        list.InsertAtIndex(12,99);  // Invalid Index
        list.display();
        list.Size();
        // to get an element at specific index
        System.out.println("element at indx 0  : "+list.GetIndexElement(0));
        System.out.println("element at indx 2 : "+list.GetIndexElement(2));
        System.out.println("element at indx 10 : "+list.GetIndexElement(10));
//        System.out.println("element at indx : "+list.GetIndexElement(11)); // error throw hoga
        // to set value ata specific index
        list.SetIndexValue(0,100);
        list.SetIndexValue(1,200);
        list.SetIndexValue(2,300);
        list.SetIndexValue(8,800);
        list.SetIndexValue(10,1300);
        list.display();
        list.Size();

        // to delete at a specific Index
        list.deleteAtHead();
        list.display();
        list.Size();
        list.deleteAtHead();
        list.display();
        list.Size();

        // to deleta at a index
        list.deleteAtIndex(1);
        list.display();
        list.Size();
        list.deleteAtIndex(7);
        list.display();
        list.Size();
    }
}
