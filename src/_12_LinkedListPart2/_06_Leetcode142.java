package _12_LinkedListPart2;

public class _06_Leetcode142 {
    // SLOW FAST POINTER
    /*
    public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null ){
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast ) {
                ListNode temp = head ;
                while(slow != temp ){
                    slow = slow.next ;
                    temp = temp.next ;
                }
                return slow ;
            }
        }
        return null;
    }
}
     */

// USING HASHSET
    /*
    public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head ;
        while(temp != null ){
            if(set.contains(temp)) return temp ;
            set.add(temp) ;
            temp = temp.next ;
        }
        return null;
    }
}

     */
}
