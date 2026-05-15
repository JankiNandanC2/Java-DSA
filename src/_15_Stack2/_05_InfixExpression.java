package _15_Stack2;

import java.util.Stack ;

public class _05_InfixExpression {

    public static int Calculate(int num1 , int num2 , char opr ){
        if(opr == '+') return num1 + num2 ;
        else if(opr == '-') return num1 - num2 ;
        else if(opr == '*') return num1 * num2 ;
        else if(opr == '/') return num1 / num2 ;
        return -1 ;
    }

    public static void main(String[] args) {
        String str = "9-5+3*4/6";

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) val.push(ascii - 48);
            else if (op.isEmpty()) op.push(ch);
            else if (ch == '+' || ch == '-') {

                // inka presidency to sbse km hota hai mtlv operation to karna hi padega
                int val2 = val.pop();
                int val1 = val.pop();
                char operator = op.pop();
                int ans = Calculate(val1, val2, operator);
                val.push(ans);
                op.push(ch);
            } else if (ch == '*' || ch == '/') {
                if (op.peek() == '*' || op.peek() == '/') {
                     int val2 = val.pop();
                     int val1 = val.pop();
                     char operator = op.pop();
                     int ans = Calculate(val1, val2, operator);
                    val.push(ans);
                    op.push(ch);
                } else op.push(ch);
            }
        }
        // pass 2
        while( val.size() > 1 ){
             int val2 = val.pop();
             int val1 = val.pop();
             char operator = op.pop();
             int ans = Calculate( val1 , val2 , operator) ;
            val.push(ans);
        }
        System.out.println(str);
        System.out.println("ans : "+val.pop());
    }
}
