package _15_Stack2;

import java.util.Stack;

public class _10_PrefixEvaluation {
    static void main(String[] args) {
        String exp = "-9/*+5346";
        exp = "+-95/*346";

        Stack<Integer> st = new Stack<>();

        for (int i = exp.length() - 1; i >= 0 ; i--) {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)) st.push(ch - '0');
            else  {
                int val1 = st.pop(); // jo pahle pop hoga vo val1 hoga
                int val2 = st.pop();
                if(ch == '+') st.push(val1 + val2)  ;
                else if(ch == '-') st.push(val1 - val2) ;
                else if(ch == '*') st.push(val1 * val2) ;
                else if(ch == '/') st.push(val1 / val2) ;
            }
        }
        System.out.println("Original Prefix expression : " +exp);
        System.out.println("result after evaluation: " +st.peek());
    }
}
