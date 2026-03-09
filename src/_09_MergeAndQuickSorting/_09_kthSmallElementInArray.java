package _09_MergeAndQuickSorting;

import java.util.Scanner;

public class _09_kthSmallElementInArray {
    static int ans ;
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
    public static void quickSelect(int[] arr , int low , int high , int k  ){
        if(low>high) return ;
        if(low==high){
            if(low == k-1 ) ans = arr[low] ;
            return;
        }
        int indx = partition(arr,low ,high);
        if (indx == k-1) {
            ans = arr[indx];
            return;
        }
        else if(k-1 < indx )quickSelect(arr,low ,indx-1,k);
        else quickSelect(arr,indx+1, high,k);
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {4,9,1,2,6,5,8};
        int n = arr.length ;
        System.out.println("Enter the required kth smallest no : ");
        int k = scan.nextInt(); // smallest no
        // to get the largest
        ans = 0 ;
//        quickSelect(arr , 0 ,arr.length-1,k);  // -- for kth smallest smallsst no
        quickSelect(arr , 0 , n-1 ,n-k+1);  // for kth largestno
        System.out.println("kth smallest no : "+ans);
    }
}
