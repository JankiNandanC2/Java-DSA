package _15_Stack2;

public class _01_Leetcode1944 {
}
/*
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length ;
        Stack<Integer> st = new Stack<>();
        int[] result = new int[n];
        for(int i = n-1 ; i >= 0  ; i-- ){
            int count = 0  ;
            while( ! st.isEmpty() && heights[i] >= st.peek() ){
                st.pop();
                count++ ;
            }
            if( ! st.isEmpty() && heights[i] < st.peek() ) count++ ;
            result[i] = count ;
            st.push(heights[i]);
        }
        return result ;
    }
}
 */
/*
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[heights.length];
        st.push(0);// for first indx
        for(int i = 1 ; i < heights.length ; i++){
            while( ! st.isEmpty() && heights[i] >= heights[st.peek()]){
                result[st.pop()]++;
            }
            if( ! st.isEmpty() &&  heights[i] < heights[st.peek()] ) { // left greater found
                result[st.peek()]++;
            }
            st.push(i);
        }
        return result ;
    }
}
 */