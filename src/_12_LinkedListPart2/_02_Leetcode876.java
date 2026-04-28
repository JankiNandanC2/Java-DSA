package _12_LinkedListPart2;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class _02_Leetcode876 {
}
// interview approach y bole to better ya yhi use karna h
/*
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        // while(fast.next != null  && fast != null ) {
        //--Runtime Error java.lang.NullPointerException: Cannot read field "next" because "<local3>" is null
        while(fast != null  && fast.next != null ) {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }
}
 */

// not for interview approach
/*
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head ;
        int size = 0 ;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        int mid = size / 2  + 1;
        temp = head ;
        for(int i = 1 ; i <= mid - 1 ; i++){
            temp  = temp.next ;
        }
        return temp  ;
    }
}
 */
