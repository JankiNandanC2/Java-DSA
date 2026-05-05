package _12_LinkedListPart2;

public class hw3Leetcode1721 {
    /*
    class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head ;
        ListNode slow = head ;
        for (int i = 1 ; i <= k - 1 ; i++){
            fast = fast.next ;
        }
        ListNode address = fast ; // address of first kth node
        // store the addres of fast as this is the first kth node address
        while(fast.next != null ){
            slow = slow.next ;
            fast = fast.next ;
        }
        int temp = address.val ;
        address.val = slow.val ;
        slow.val = temp ;
        return head ;
    }
}
     */
}
