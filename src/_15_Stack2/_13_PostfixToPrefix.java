package _15_Stack2;

import java.util.Stack;

public class _13_PostfixToPrefix {
    static void main(String[] args) {
        String exp = "953+4*6/-";

        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length()  ; i++) {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)) st.push(String.valueOf(ch));
            else  {
                String val2 = st.pop();
                String val1 = st.pop();
                st.push( ch + val1  +  val2 );
            }
        }
        System.out.println("Postfix expression : " +exp);
        System.out.println("Prefix Expression : " +st.peek());
    }
}
