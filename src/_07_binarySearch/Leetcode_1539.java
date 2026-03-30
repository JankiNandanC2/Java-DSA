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
// brut Force Approach -- O(n)
/*
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0 ;
        for( i = 0 ; i<arr.length ; i++){
            int missing = arr[i] - (i+1) ;
            if(missing >= k) return i+k ;
        }
        return k + i ;
    }
}
 */
