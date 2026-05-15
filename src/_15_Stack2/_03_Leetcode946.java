package _15_Stack2;

public class _03_Leetcode946 {
}
/*
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int i = 0 , j = 0 ;
        while( i < pushed.length ){
            st.push(pushed[i]);
            while(! st.isEmpty() && st.peek() == popped[j] ){
               st.pop();
               j++ ;
            }
            i++ ;
        }
        return st.isEmpty();
    }
}
 */
