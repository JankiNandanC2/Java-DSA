package _09_MergeAndQuickSorting;
/*
Given an integer array nums, return the number of reverse pairs in the array.
A reverse pair is a pair (i, j) where:
0 <= i < j < nums.length and
nums[i] > 2 * nums[j].

Example 1:
Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
 */
public class _06_Leetcode493ReversePairs {
    static int count ;
    public static void inversionCount(int[] a , int[] b ){
        int i = 0 , j = 0 ;
        while(i<a.length && j < b.length){
            if((long) a[i]  > (long) 2 * (long) b[j]){
                count += a.length-i ;
                j++;
            }
            else i++ ;
        }
    }
    public static void merge( int[] a , int[] b, int[] arr){
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            // to maintain the stability of array i.e relative position of two equal elements we make it a[i] <= b[j]
            if( a[i] <= b[j] ) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while(i<a.length) arr[k++] = a[i++] ;
        while(j<b.length) arr[k++] = b[j++] ;
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return ;
        // create 2 array to store n/2 and n-n/2 values in them respectively
        int[] left = new int[n/2];
        int[] right = new int[n-n/2];
        // copy value into left and right
        for(int i = 0 ; i < n/2 ; i++){
            left[i] = arr[i];
        }
        for(int i = 0 ; i<n-n/2 ; i++){
            right[i] = arr[n/2 + i ] ;
        }
        //use recursion magic
        mergeSort(left);
        mergeSort(right);

        // use sorted array concept
        merge(left ,right,arr);

        // perform the inversionCount
        inversionCount(left, right);

        // to improve the space cmmplexity from nlogn ---> n
        left = null ;
        right =null ;
    }
    static void main(String[] args) {
        int[] arr ={1,3,2,3,1};
        count = 0 ;
        mergeSort(arr);
        System.out.println("No of reverse Pairs Are : ");
        System.out.println(count);
    }
}
