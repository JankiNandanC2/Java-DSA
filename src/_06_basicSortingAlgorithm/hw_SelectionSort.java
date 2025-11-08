package _06_basicSortingAlgorithm;

// change - put the kth max element att the right position

import java.util.Arrays;

public class hw_SelectionSort {
    static void main(String[] args) {
        int[] arr ={10,-4,20,1,8,-6};
        int n = arr.length;
        int k = n-1 ;
        for(int i = 0 ; i<n-1 ; i++){
            int max = Integer.MIN_VALUE;
            int maxIndex= -1;
            for (int j = 0; j < n-i; j++) {
                if(max<arr[j]){
                    max=arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex]= arr[k];
            arr[k--] = temp ;
        }
        System.out.println(Arrays.toString(arr));
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
    }
}
