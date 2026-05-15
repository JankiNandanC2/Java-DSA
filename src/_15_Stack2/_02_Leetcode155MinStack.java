package _15_Stack2;

public class _02_Leetcode155MinStack {
}
/*
class MinStack {

    Stack<Integer> st;
    int currMin ;

    public MinStack() {
        st = new Stack<>();
        currMin = Integer.MAX_VALUE ;
    }

    public void push(int val) {
        if ( val <= currMin ) {
            st.push(currMin) ; // to track last min element
            currMin = val ;
        }
        st.push(val);
    }

    public void pop() {
        int ele = st.pop(); // popped element
        if ( ele == currMin ) {
            currMin = st.pop() ; // assign the prev min to curr and remove extra added
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return currMin ;
    }
}
 */
/*
class MinStack {

    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
        st.push(val);
    }

    public void pop() {
        int n = st.pop();
        if (n == minSt.peek()) {
            minSt.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }
}
 */