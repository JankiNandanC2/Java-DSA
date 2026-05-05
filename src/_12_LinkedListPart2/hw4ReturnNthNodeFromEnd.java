package _12_LinkedListPart2;
// gFg
public class hw4ReturnNthNodeFromEnd {
    /*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

    class Solution {

        // Function to find the data of kth node from
        // the end of a linked list.
        int getKthFromLast(Node head, int k) {
            // Your code here
            Node fast = head ;
            Node slow = head ;
            // first move the fast k-1 step ahead
            for(int i = 1 ; i <= k-1 ; i++){
                if(fast == null ) return -1;
                fast = fast.next ;
            }
            if(fast == null ) return -1;
            // now find the kth from last
            while(fast.next != null){
                slow = slow.next ;
                fast = fast.next ;
            }
            return slow.data ;
        }
    }
     */
}
