package _06_basicSortingAlgorithm;

import java.util.Arrays;

// sir's approach
public class _09_TransformArray {
    static void main(String[] args) {
        int[] arr = {40,12,78,34,100,57,23};
        System.out.println(Arrays.toString(arr));
        int n = arr.length ;
        int x = 0;
        for (int i = 0; i < n  ; i++) {
            int min = Integer.MAX_VALUE;
            int minINdx = -1 ;
            for (int j = 0; j < n  ; j++) {
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    minINdx=  j;
                }
            }
            arr[minINdx]= x ;
            x--;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            arr[i]= arr[i] *-1 ;
        }
        System.out.println(Arrays.toString(arr));
    }
}
