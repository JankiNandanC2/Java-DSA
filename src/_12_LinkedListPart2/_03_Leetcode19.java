package _12_LinkedListPart2;

public class _03_Leetcode19 {
    /*
    class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null ; // for only 1  node case
        ListNode fast = head ;
        ListNode slow = head ;
        // first move kar do fast ko n steps aage
        for(int i = 1 ; i <= n ; i++){
            fast = fast.next ;
        }
    // to delete the head case : list [1,2] and n = 2
        if(fast == null ){ // MTLV HEAD KO DELETE KARNA HAI
            return head.next ;
        }
        while(fast.next != null){
            slow = slow.next ;
            fast = fast.next ;
        }
        slow.next = slow.next.next ;
        return head ;
    }
}
     */
}

/*
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head ;
        int length = 0 ;
        while(temp != null ){
            temp = temp.next;
            length++ ;
        }
        if( length == 1) return null ; // agar ek hi node h list e tv
        if( length == n ) return head.next ; // agar head ko hi delete karna hai
        // nth node from last == (length  - n + 1 )
        // to delete (length  - n + 1 ) we need address* of (length - n)th node
        temp = head ;
        for(int i = 1 ; i <= length - n - 1 ; i++ ){
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
        return head ;
    }
}
 */
