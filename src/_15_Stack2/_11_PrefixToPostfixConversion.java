package _15_Stack2;

import java.util.Stack;

public class _11_PrefixToPostfixConversion {
    static void main(String[] args) {
        String exp = "-9/*+5346";
//        exp = "+-95/*346";

        Stack<String> st = new Stack<>();

        for (int i = exp.length() - 1; i >= 0 ; i--) {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)) st.push(String.valueOf(ch));
            else  {
                String val1 = st.pop(); // jo pahle pop hoga vo val1 hoga
                String val2 = st.pop();
                st.push( "(" + val1 + ch +  val2 + ")");
            }
        }
        System.out.println("Original Prefix expression : " +exp);
        System.out.println("Infix Expression : " +st.peek());
    }
}
