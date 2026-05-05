package _14_Stack;

import java.util.Stack;

public class _05_pushElementsAtBottomOrAnyIndex {
    static void main(String[] args) {
        Stack<Integer>  stOriginal = new Stack<>();
        stOriginal.push(10);
        stOriginal.push(20);
        stOriginal.push(30);
        stOriginal.push(40);
        System.out.println("original Stack :"+stOriginal);
        // to insert new element at bottom of stack
        int newElement = 50 ;
        Stack<Integer> stTemp = new Stack<>();
        while ( ! stOriginal.isEmpty()){
            stTemp.push(stOriginal.pop());
        }
        stOriginal.push(newElement);
        while ( ! stTemp.isEmpty()){
            stOriginal.push(stTemp.pop());
        }
        System.out.println("original Stack after Inserting at bottom of stack:"+stOriginal);

        // to push at  any given index suppose insert 100 at 2 index
        System.out.println("original Stack :"+stOriginal);

        int givenPosition = 2 ;
        newElement = 100 ;
        while ( stOriginal.size() >= givenPosition){
            stTemp.push(stOriginal.pop());
        }
        stOriginal.push(newElement);
        while ( ! stTemp.isEmpty()){
            stOriginal.push(stTemp.pop());
        }
        System.out.println("After inserting 100 at given position  : "+ stOriginal);
    }
}
