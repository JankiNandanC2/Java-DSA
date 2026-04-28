package _12_LinkedListPart2;

import java.util.Scanner;

class Node{
    Node next ;
    int val ;
    Node(int val){
        this.val = val ;
    }
}
class SinglyLinkedList{
    Node head ;
    private Node tail ;
    private int size ;
    void InsertAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp ;
            tail = temp ;
        }
        else {
            temp.next = head ;
            head = temp ;
        }
        size++ ;
    }
    void InsertAtTail(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp ;
            tail = temp ;
        }
        else {
            tail.next = temp ;
            tail = temp ;
        }
        size++ ;
    }
    void Insert(int indx , int val ){
        if(indx > size || indx < 0) {
            System.out.println("Invalid index");
            return ;
        }
        if(indx == 0 ) InsertAtHead(val);
        if(indx == size) InsertAtTail(val);

        Node temp = new Node(val);
        Node x = head ;
        for(int i = 1 ; i <= indx - 1 ; i++){
            x = x.next ;
        }
        temp.next = x.next ;
        x.next = temp ;
        size++ ;
    }
    void display( ){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next ;
        }
        System.out.println();
    }
    int findLeftMidElement(Node Head){
        Node slow = head ;
        Node fast = head ;
        while(fast.next != null && fast.next.next != null ){ // odd cond && even condition
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow.val ;
    }
}
public class hw1FindLeftMiddleOfLinkedList {
    static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Node to be inserted in list : ");
        while(true){
            System.out.println("enter node value : ");
            list.InsertAtTail(scan.nextInt());
            System.out.println("do you want to Inset more node  : Y/N ");
            String choice = scan.next();
            if(choice.equalsIgnoreCase("N")) break ;
        }
        System.out.println("LinkedList : ");
        list.display();
        int element = list.findLeftMidElement(list.head);
        System.out.println("LinkedList left mid element value is :" + element);
    }
}
