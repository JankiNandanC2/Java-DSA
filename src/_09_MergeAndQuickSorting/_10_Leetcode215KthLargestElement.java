package _09_MergeAndQuickSorting;

public class _10_Leetcode215KthLargestElement {
}
/*
class Solution {
    static int ans ;
     public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
    public static int partition(int[] arr , int low  , int high ){
        int mid = (low + high )/2 ;
        int pivot = arr[mid] , smallerCount = 0 ;
        for (int i = low  ; i <= high; i++) {
            if(i == mid) continue ;
            if(arr[i] <= pivot ) smallerCount++ ;
        }
        int correctIndx = low + smallerCount ;
        swap(arr,mid, correctIndx);
        int i = low , j = high ;
        while(i< correctIndx && j > correctIndx){
            if(arr[i]<= pivot ) i++ ;
            else if (arr[j] > pivot ) j-- ;
            else if(arr[i] > pivot && arr[j] <= pivot ){
                swap(arr, i, j);
                i++ ; j--;
            }
        }
        return correctIndx ;
    }
    public static void quickSelect(int[] arr , int low , int high , int k  ){
        if(low>high) return ;
        int indx = partition(arr,low ,high);
        if (indx == k-1) {
            ans = arr[indx];
            return;
        }
        if(k-1 < indx ) quickSelect(arr,low ,indx-1,k);
        else quickSelect(arr,indx+1, high,k);
    }
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length ;
        ans = 0 ;
        quickSelect(nums , 0 , n-1 ,n-k+1);
        return ans ;
    }
}
 */