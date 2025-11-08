package _01_Array;

import java.util.Arrays;

public class _11_BuiltInFunction {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        // for each loop
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        Arrays.sort(arr); // builtIn Function
        System.out.println();
        for (int i = 0; i <= arr.length-1  ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
