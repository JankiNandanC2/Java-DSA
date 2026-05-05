package _12_LinkedListPart2;

public class _04_Leetcode160 {
    /*
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode tempA = headA ;
            ListNode tempB = headB ;
            int lenA = 0 , lenB = 0  ;
            // a ka length
            while(tempA != null ){
                tempA = tempA.next ;
                lenA++ ;
            }
            // b ka length
            while(tempB != null ){
                tempB = tempB.next ;
                lenB++ ;
            }
            tempA = headA ;
            tempB = headB ;
            // find the max length
            int max = 0 , min = 0 ;
            if( lenA > lenB) {
                max = lenA ;
                min = lenB ;
            }
            else {
                max = lenB ;
                min = lenA ;
            }
            for(int i = 1 ; i <= max - min ; i++){
                if( lenA == max )
                    tempA = tempA.next ;
                else
                    tempB = tempB.next ;
            }
            while(tempA != tempB ){
                tempA = tempA.next ;
                tempB = tempB.next ;
            }
            return tempA ;
        }
    }
     */
}
