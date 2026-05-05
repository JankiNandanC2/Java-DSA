package _14_Stack;
import java.util.Stack ;
public class _01_BasicStack {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("stack is empty : "+st.isEmpty());
        // insert a element
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        // to print a stack
        System.out.println(st);
        System.out.println("top most element: "+st.peek());
        System.out.println("Size of stack is : "+ st.size());
        System.out.println("stack is empty : "+st.isEmpty());
        // to remove a element
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        st.push(10);
        st.push(20);
        System.out.println(st);
        // to access the first element of stack
        while(st.size() > 1 ){
            st.pop();
        }
        System.out.println("first element is : "+ st.peek());
        System.out.println("Size of stack is : "+ st.size());
    }
}
