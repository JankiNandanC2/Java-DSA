package _09_MergeAndQuickSorting;

public class _07_QuickSort {
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
    public static int partition(int[] arr , int low  , int high ){
        int mid = (low+high)/2 ;
        int pivot = arr[mid] , smallerCount = 0 ;
        for (int i = low ; i <= high; i++) {
            if(i == mid ) continue;
            if(arr[i] <= pivot ) smallerCount++ ;
        }
        int correctIndx = low + smallerCount ;
        swap(arr, mid , correctIndx);
        int i = low , j = high ;
        while(i < correctIndx && j > correctIndx){
            if(arr[i]< pivot) i++ ;
            else if (arr[j] > pivot) j-- ;
            else if(arr[i] > pivot && arr[j] <= pivot){
                swap(arr, i, j);
                i++ ;
                j--;
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
