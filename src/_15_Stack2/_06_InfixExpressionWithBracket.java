package _15_Stack2;

import java.util.Stack;

public class _06_InfixExpressionWithBracket {
    public static int Operation(int num1 , int num2, char opr){
        if(opr == '+') return num1 + num2 ;
        else if(opr == '-') return num1 - num2 ;
        else if(opr == '*') return num1 * num2 ;
        else if(opr == '/') return num1 / num2 ;
        return -1 ;
    }
    static void main(String[] args) {
//        String exp = "9-(5+3)*4/6";
        String exp = "8-(5+3)*(4/6)";
        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(Character.isDigit(ch) ) num.push(ch-'0');
            else if( op.isEmpty() ||  ch == '(' || op.peek() == '(' ) op.push(ch);
            else if (ch == ')'){
                while(op.peek() != '(' ){
                    int val2 = num.pop();
                    int val1 = num.pop();
                    char o = op.pop();
                    int val = Operation(val1 , val2 , o);
                    num.push(val);
                }
                op.pop();
            }
            else if( ch == '+' || ch == '-'){
                int val2 = num.pop();
                int val1 = num.pop();
                char o = op.pop();
                int val = Operation(val1 , val2 , o);
                num.push(val);
                op.push(ch);
            } else if (ch == '*' || ch == '/') {
                if( op.peek() == '*' || op.peek() == '/') {
                    int val2 = num.pop();
                    int val1 = num.pop();
                    char o = op.pop();
                    int val = Operation(val1 , val2 , o);
                    num.push(val);
                    op.push(ch);
                }
                else op.push(ch);
            }
        }

        // 2nd pass
        while( num.size() > 1 ) {
            int val2 = num.pop();
            int val1 = num.pop();
            char o = op.pop();
            int val = Operation(val1 , val2 , o);
            num.push(val);
        }

        System.out.println("Original Expression is : "+ exp);
        System.out.println("Answer is : " + num.peek());
    }
}
