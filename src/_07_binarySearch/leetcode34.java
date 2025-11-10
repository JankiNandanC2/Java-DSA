package _07_binarySearch;

// find first and last position of element in a sorted array

// method 1 -- using lb and ub

import java.util.Arrays;

public class leetcode34 {
    static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7 ;
        int[] sol = searchRange(nums, target);
        System.out.println(Arrays.toString(sol));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        int n = nums.length ;
        // check if element is present
        boolean flag = false ; // false means not present
        int low  = 0 , high = n-1 ;
        while(low<=high){
            int mid = low + ((high -low)/2);
            if(nums[mid]==target) {
                flag = true ; // element found
                break ;
            }
            else if(nums[mid]>target) high = mid-1 ;
            else low = mid+1;
        }
        if(flag == false) return ans;
        // finding lower bound
        int lb = n ;
        low = 0 ;
        high = n-1 ;
        while(low<=high){
            int mid = low + ((high -low)/2);
            if(nums[mid]>=target) {
                lb = Math.min(lb , mid);
                high = mid - 1 ;
            }
            else low = mid+1;
        }
        ans[0] = lb ;
        // finding upperBound
        int ub = n ;
        low = 0 ;
        high = n-1 ;
        while(low<=high){
            int mid = low + ((high -low)/2);
            if(nums[mid]>target) {
                ub = Math.min(ub , mid);
                high = mid - 1 ;
            }
            else low = mid+1;
        }
        ans[1] = ub - 1 ;
        return ans ;
    }
}
