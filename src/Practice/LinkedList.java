package Practice;

import java.util.Scanner;

class Node{
    int val ;
    Node next ;
    Node(int val ){
        this.val = val ;
        this.next = null ;
    }
}
class SinglyLinkedList {
     Node head = null;
     Node tail = null ;
     int size = 0 ;

    public void InsertAtTail(int val ){
        Node temp = new Node(val);
        if( size == 0 ){
            head = temp ;
            tail = temp ;
            size = 1 ;
            return ;
        }
        tail.next = temp ;
        tail = temp ;
        size++ ;
    }

    public int getSize(){
        return  size ;
    }

    public int displayMiddle(){
        if( size == 0 ) return 0 ;
        Node fast = head ;
        Node slow = head ;

        while( fast.next != null && fast.next.next != null ){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow.val ;
    }
}
public class LinkedList {
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0 ; i < n ; i++){
            int num = scanner.nextInt();
            list.InsertAtTail(num);
        }
        int middle = list.displayMiddle();
        System.out.println(middle);
    }
}
