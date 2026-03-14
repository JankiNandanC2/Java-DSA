package _10_CycleSort;

public class _01_Leetcode268 {
}

// using Maths
/*
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int totalSum = (n*(n+1))/2;
        int sum = 0 ;
        for(int i = 0 ; i < n  ;i++){
           sum += nums[i];
        }
        // use maths
        return totalSum-sum ;
    }
}
 */

// using CycleSort
/*
class Solution {
    public void swap(int i , int j , int[] arr){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int i = 0 ;
        while(i<n){
           if(nums[i] == i  || (nums[i] == n )) i++;
           else {
            swap(i, nums[i],nums);
           }
        }
        for( i = 0 ; i < n  ;i++){
           if(nums[i] !=  i) return i ;
        }
        return i ;
    }
}
 */


// using exttra space
/*
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        boolean[] bool = new boolean[n+1];
        for(int i = 0 ; i<n ; i++){
            int indx = nums[i];
            bool[indx] = true;
        }
        for(int i = 0 ; i <= n ;i++){
            if(! bool[i]) return i ;
        }
        return -1 ;
    }
}
 */
