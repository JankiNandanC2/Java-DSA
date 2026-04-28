package _13_LinkedListPart3;

public class LeetCode430 {
}
/*  O ( n )
class Solution {
    public Node flattenChild(Node head) {
        Node temp = head;
        Node curr = temp; // to track the tail bro
        while (temp != null) {
            curr = temp;
            Node n = temp.next;
            if (temp.child != null) {
                Node c = temp.child;
                temp.child = null;
                temp.next = c;
                c.prev = temp;
                c = flattenChild(c); // recursion --> faith
                // connecting next n to tail of flatten child
                if( n != null ) c.next = n; // flattten se tail return aaya
                if (n != null) n.prev = c;
            }
            temp = temp.next ;
        }
        return curr;
    }
    public Node flatten(Node head) {
        Node temp = head;
        flattenChild(head);
        return head;
    }
}
 */

/*  O ( n^2 )
class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while (temp != null) {
            Node n = temp.next;
            if (temp.child != null) {
                Node c = temp.child ;
                temp.child = null ; // child gya
                temp.next = c ; c.prev = temp ; // child se connect
                c = flatten(c); // recursion --> faith
                Node tail = c ;
                while( tail.next != null) tail = tail.next ; // flatten child ka tail
                tail.next = n ;
                if( n != null ) n.prev = tail ;
            }
            temp = n;
        }
        return head;
    }
}
 */


