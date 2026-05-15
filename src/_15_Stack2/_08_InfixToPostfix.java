package _15_Stack2;

import java.util.Stack;

public class _08_InfixToPostfix {
    static void main(String[] args) {
        String exp = "9-5+3*4/6" ;
        exp = "8-(5+3)*(4/6)";

        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < exp.length() ; i++) {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)) st.push(String.valueOf(ch));
            else if ( op.isEmpty() || ch == '(' || op.peek() == '(') op.push(ch);
            else if (ch == ')') {
                while(op.peek() != '('){
                    String val2 = st.pop();
                    String val1 = st.pop();
                    String operation =  val1 + val2 + op.pop() ;
                    st.push(operation);
                }
                op.pop();
            }
            else if (ch == '+' || ch == '-' ) {
                String val2 = st.pop();
                String val1 = st.pop();
                String operation =  val1 + val2 + op.pop() ;
                st.push(operation);
                op.push(ch);
            }
            else if ( ch == '*' || ch == '/') {
                if( op.peek() == '*' || op.peek() == '/'){
                    String val2 = st.pop();
                    String val1 = st.pop();
                    String operation =  val1 + val2 + op.pop()  ;
                    st.push(operation);
                    op.push(ch);
                }
                else op.push(ch);
            }
        }


        // 2nd pass
        while( st.size() > 1){
            String val2 = st.pop();
            String val1 = st.pop();
            String operation =  val1 + val2 + op.pop() ;
            st.push(operation);
        }

        System.out.println("Original Infix expression : " +exp);
        System.out.println("Prefix expression : " +st.peek());
    }
}
