package _14_Stack;
class Stack{
    private int[] arr = new int[5];
    int idx = 0 ;
    void push(int x){
        if(isFull()) {
            System.out.println("Stack full");
            return ;
        }
        arr[idx] = x ;
        idx++ ;
    }
    int peek(){
        if(isEmpty()) {
            System.out.println("stack is empty");
            return -1 ;
        }
        return arr[idx - 1] ;
    }
    int pop(){
        if(isEmpty()){
            System.out.print("stack empty ");
            return 0;
        }
        idx -= 1 ;
        int top = arr[idx];
        arr[idx] = 0 ;
        return top ;
    }
    void display(){
        if(isEmpty()) return;
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    int size(){
        return idx ;
    }
    boolean isFull(){
        if(idx == arr.length) return true ;
        return false ;
    }
    boolean isEmpty(){
        if(idx == 0) return true ;
        return false ;
    }
}
public class _08_ArrayImplementation {
    static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("is empty : "+st.isEmpty());
        st.display();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println("size : "+st.size());
        System.out.println("top eleent  : "+st.peek()); // top element
        st.pop();
        st.display();
        System.out.println("is empty : "+st.isEmpty());
        System.out.println("is full : "+st.isFull());
        st.push(50);
        st.push(60);
        st.display();
        System.out.println("is full : "+st.isFull());
    }
}
