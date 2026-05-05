package _12_LinkedListPart2;

public class _08_Leetcode61RotateList {
    /*
    class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if( head == null || head.next == null ) return head ;
        int length = 0 ;
        ListNode temp = head ;
        while( temp != null ){
            temp = temp.next ;
            length++ ;
        }
        k = k % length ;
        if( k == 0 ) return head ;
        ListNode slow = head ;
        ListNode fast = head ;
        for(int i = 1 ; i <= k ; i++){
            fast = fast.next ;
        }
        while( fast.next != null ){
            slow = slow.next ;
            fast = fast.next ;
        }
        if( slow == fast ) return head ;
        ListNode newHead = slow.next ;
        slow.next = null ;
        fast.next = head ;
        return newHead ;
    }
}
     */
}
