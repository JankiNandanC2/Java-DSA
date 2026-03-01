package _09_MergeAndQuickSorting;

public class _07_QuickSort {
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
    public static int partition(int[] arr , int low  , int high ){
        int pivot = arr[low] , smallerCount = 0 ;
        for (int i = low +1 ; i <= high; i++) {
            if(arr[i] < pivot ) smallerCount++ ;
        }
        int correctIndx = low + smallerCount ;
        swap(arr,low , correctIndx);
        // now make changes i.e pivot ya correct indx ke left me usse chhota number higa and right me usse bada number hoga
        int i = low , j = high ;
        while(i < correctIndx && j > correctIndx){
            if(arr[i]<arr[correctIndx]) i++ ;
            else if (arr[j] > arr[correctIndx]) j-- ;
            else if(arr[i] > arr[correctIndx] && arr[j] < arr[correctIndx]){
                swap(arr, i, j);
                i++ ; j--;
            }
        }
        return correctIndx ;
    }
    public static void quickSort(int[] arr , int low , int high ){
        if(low>=high) return;
        // first find the pivot element
        int pivot = partition(arr,low ,high);
        quickSort(arr,low ,pivot-1);
        quickSort(arr,pivot+1, high);
    }
    static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        quickSort(arr , 0 ,arr.length-1);
        for(int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
