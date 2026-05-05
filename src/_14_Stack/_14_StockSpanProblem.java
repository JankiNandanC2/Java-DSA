package _14_Stack;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack ;

public class _14_StockSpanProblem {
    static void main(String[] args) {
        int[] price = {10,4,5,90,120,80};
        printArray(price);
        int n = price.length ;
        int[] ans = new int[n];

        //method 1 naive approach -- O(n^2)
        calculateSpan(price , n , ans);
        printArray(ans);

        // method 2 using stack
        System.out.println("method 2 using stack : ");
        ArrayList<Integer> list = calculateSpanUsingStack(price);
//        System.out.println(list);
    }
    public static void calculateSpan(int[] price , int n , int[] ans){
        for(int i = 0 ; i < n ; i++){
            int count = 0 ;
            for(int j = i ; j >= 0 ; j--){
                if(price[j] <= price[i]) count++ ;
                else break ;
            }
            ans[i] = count ;
        }
    }
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    // method 2 using stack
    public static ArrayList<Integer> calculateSpanUsingStack(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            while( !st.isEmpty() && arr[st.peek()] <= arr[i] ){
                st.pop();
            }
            if(st.isEmpty()) list.add(i+1);
            else list.add(i - st.peek());
            st.push(i);
        }
        System.out.println(list);
        return list ;
    }
}
