package _12_LinkedListPart2;

public class _07_Leetcode83RemoveDuplicatesFromSortedLIst {
    /*
        class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode a = head;
        ListNode b = head;
        while (b != null) {
            if (a.val == b.val) {
                b = b.next;
            } else {
                a.next = b;
                a = b;
            }
        }
        // to handle the last node case
        a.next = b;
        return head;
    }
}
     */

    /*
    // mine version
         class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null  || head.next == null )
            return head ;
        ListNode temp = head ;
        while( temp != null && temp.next != null){
            int curr = temp.val ;
            int next = temp.next.val ;
            if( next == curr ){
                temp.next = temp.next.next ;
            }
            else temp = temp.next ;
        }
        return head ;
    }
}

     */
}


