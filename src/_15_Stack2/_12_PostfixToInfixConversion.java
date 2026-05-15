package _15_Stack2;

import java.util.Stack;

public class _12_PostfixToInfixConversion {
    static void main(String[] args) {
        String exp = "953+4*6/-";

        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length()  ; i++) {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)) st.push(String.valueOf(ch));
            else  {
                String val2 = st.pop();
                String val1 = st.pop();
                st.push( "(" + val1 + ch +  val2 + ")");
            }
        }
        System.out.println("Postfix expression : " +exp);
        System.out.println("Infix Expression : " +st.peek());
    }
}
