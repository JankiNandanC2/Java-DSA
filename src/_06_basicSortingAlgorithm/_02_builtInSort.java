package _06_basicSortingAlgorithm;

import java.util.Arrays;

public class _02_builtInSort {
    static void main(String[] args) {
        int[] arr = {1,7,3,8,9,13};
        for(int ele: arr){
            System.out.print(ele+" ");;
        }
        Arrays.sort(arr);
        System.out.println();
        for(int ele: arr){
            System.out.print(ele+" ");;
        }
    }
}
