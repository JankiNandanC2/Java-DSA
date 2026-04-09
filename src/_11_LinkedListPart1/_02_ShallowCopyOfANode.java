package _11_LinkedListPart1;
// we can access the class Node created  in _01_basics
public class _02_ShallowCopyOfANode {
    public static void PrintLinkedList(Node Head){
        Node temp = Head ;
        while( temp != null ){
            System.out.println(temp.val);
            temp = temp.next ;
        }
    }
    static void main(String[] args) {
        Node a = new Node(100);
//         Node temp = new Node(a.val); // deep copy
        Node temp = a ;  // Shallow Copy
        System.out.println(temp); // address of a
        System.out.println(a); // address of a
        temp.val = 12 ; // value of a is changed
        System.out.println(temp.val); // value of a
        System.out.println(a.val); // valur of a

        System.out.println("node of linkedList are :- ");
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        // linking of nodes
        a.next = b ; // linking =>  a -> b
        b.next = c ; // linking =>  a -> b -> c
        c.next = d ; // linking =>  a -> b -> c -> d
        d.next = e ; // linking =>  a -> b -> c -> d -> e

        // to rint the linkedList
        PrintLinkedList(a); // a is passed as head
    }
}
