package _15_Stack2;
import java.util.Stack;
public class _04_Leetcode394DecodeString {
}
class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray() ) {
            if(ch != ']') st.push(ch);
            else {
                StringBuilder sb = new StringBuilder();
                while( ! st.isEmpty() && st.peek() != '['){
                    sb.append(st.pop());
                }
                // now pop the "[" bracket
                st.pop();
                // now get the number k
                int base = 1 ; int k = 0 ;
                while( !st.isEmpty() && Character.isDigit(st.peek())){
                    k = (st.pop() - '0') * base + k ;
                    base *= 10 ;
                }
                sb.reverse();
                // push the stringbuilder sb ka characterk k times in stack
                while(k-- > 0 ){
                    for(int j = 0 ; j < sb.length() ; j++){
                        st.push(sb.charAt(j));
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder(st.size());
        while( ! st.isEmpty()) ans.append(st.pop());
        return ans.reverse().toString() ;
    }
}
