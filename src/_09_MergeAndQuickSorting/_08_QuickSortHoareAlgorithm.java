package _09_MergeAndQuickSorting;

import java.util.Random;

public class _08_QuickSortHoareAlgorithm {
    public static int partition(int[] arr , int low  , int high ){
//        int pivot = arr[low]; --> gives O(n^2) for sorted array
        // using random pivot
         // Random ran = new Random();
         // int indx = ran.nextInt(high - low + 1) + low ;
        int pivotIndx = low + (int) (Math.random() * (high - low + 1)) ; // to find random indx
        int pivot = arr[pivotIndx];
        int i = low-1  , j = high + 1 ;
        while (true){
            do{
                i++ ;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            // return j
            if(i>=j) return j;
            //  else swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
        }
    }
    public static void quickSort(int[] arr , int low , int high ){
        if(low < high){
            int pivot = partition(arr, low ,high);
            quickSort(arr,low ,pivot);
            quickSort(arr,pivot+1, high);
        }
        else return;
    }
    static void main(String[] args) {
//        int[] arr = {4,9,7,1,2,3,6,5,8};
        int[] arr = {80,90,10,70,30,60,40,20,50};
        quickSort(arr , 0 ,arr.length-1);
        for(int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
