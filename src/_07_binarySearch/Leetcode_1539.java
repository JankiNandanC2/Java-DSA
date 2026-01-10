package _07_binarySearch;

public class Leetcode_1539 {
/*
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int  n =  arr.length ;
            int low = 0 , high = n-1  ;
            while(low<=high){
                int mid = low + (high - low)/2 ;
                int missed = arr[mid] - mid - 1 ;
                if (missed > k ) high = mid - 1 ;
                else low = mid + 1 ;
            }
            return low + k  ;
        }
    }
*/
}
