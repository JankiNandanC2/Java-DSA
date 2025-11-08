package _01_Array;

import java.util.Arrays;

public class _20_SortArraysOfZeroAndOne {
    public static void main(String[] args) {
        int[] arr = {1 ,0, 0,1,1,1,0,0,1,0};
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        // method 1
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        int noOfZero = 0;
//        int noOfOne = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]==0) noOfZero++;
//            else noOfOne++;
        }
        for(int i = 0 ; i< arr.length; i++){
            if(i < noOfZero) arr[i]=0;
            else arr[i] = 1;
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}
