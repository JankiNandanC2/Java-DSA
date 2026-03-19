package _06_basicSortingAlgorithm;

import java.util.Arrays;
// logic created by me -- not work for negative no

public class _08_TransformArray {
    static void main(String[] args) {
        int[] arr = {40,12,78,34,100,57,23};
        System.out.println(Arrays.toString(arr));

        int minIndex = -1 ; // last element index
        int lastMinElement = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min && arr[j] >= lastMinElement){
                    min = arr[j];
                    minIndex = j ;
                }
            }
            arr[minIndex] = lastMinElement;
            lastMinElement+=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
