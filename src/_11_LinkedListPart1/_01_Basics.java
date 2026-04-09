package _11_LinkedListPart1;

class Node {
    int val ; // value
    Node next ;
    Node(int val){
        this.val = val ;
    }
}
public class _01_Basics {
    static void main(String[] args) {
        System.out.println();
        Node a = new Node(10);
        /*
        System.out.println(a);
        Node temp = a ;
        System.out.println(temp);
        Node tem = new Node(10);
        System.out.println(tem);
         */
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

    // linking of nodes
        a.next = b ; // linking =>  a -> b
        b.next = c ; // linking =>  a -> b -> c
        c.next = d ; // linking =>  a -> b -> c -> d
        d.next = e ; // linking =>  a -> b -> c -> d -> e
        // if we want to create a loop of linkedList we can put the address of first node in last node
/*
// to print the address of the nodes
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next); //  last  node -->  null
 */

        // print the value of nodess
        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);

        System.out.println();

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);

        //printing using shallow copy
        /*
        System.out.println();
        Node temp = a ;
        System.out.println(temp.val);
        temp = temp.next ;
        System.out.println(temp.val);
 */

        // printing Linked List using temp(head)
        System.out.println();
        Node temp = a ;
        /*
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println(temp.val);
            temp = temp.next ;
        }
 */

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next ;
        }
    }
}
