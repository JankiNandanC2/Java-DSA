package _15_Stack2;

import java.util.Stack;

public class _09_PostfixEvaluation {
    static void main(String[] args) {
        String exp = "953+4*6/-" ;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < exp.length() ; i++) {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)) st.push(ch - '0');
            else  {
                int val2 = st.pop();
                int val1 = st.pop();
                if(ch == '+') st.push(val1 + val2)  ;
                else if(ch == '-') st.push(val1 - val2) ;
                else if(ch == '*') st.push(val1 * val2) ;
                else if(ch == '/') st.push(val1 / val2) ;
            }
        }

        System.out.println("Original Postfix expression : " +exp);
        System.out.println("result after evaluation: " +st.peek());
    }
}
