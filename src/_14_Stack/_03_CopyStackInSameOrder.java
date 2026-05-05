package _14_Stack;

import java.util.Stack;

public class _03_CopyStackInSameOrder {
    static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(10);
        originalStack.push(20);
        originalStack.push(30);
        originalStack.push(40);
        System.out.println("original stack : " + originalStack);
        // temporary stack is reversed stack
        Stack<Integer> tempStack = new Stack<>();
        while(! originalStack.isEmpty()){
            tempStack.push(originalStack.pop());
        }
        System.out.println("temp stack : "+tempStack);
        // copied stack -> final stack is reverse of reversed stack i.e reverse of temp
        Stack<Integer> finalStack = new Stack<>();
        while (! tempStack.isEmpty()){
            finalStack.push(tempStack.pop()) ;
        }
        System.out.println("final copied stack : "+finalStack);
    }
}
