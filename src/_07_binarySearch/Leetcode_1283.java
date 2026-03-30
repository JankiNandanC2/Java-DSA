package _07_binarySearch;

public class Leetcode_1283 {
    /*
        1283. Find the Smallest Divisor Given a Threshold -------    || Medium ||
(Q). Given an array of integers nums and an integer threshold, we will choose a positive integer divisor,
divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned
 above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element.
 (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.

Example 1:
Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).

Example 2:
Input: nums = [44,22,33,11,1], threshold = 5
Output: 44

*/
}

/*
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length ;
        int mx = nums[0] ;
        for(int i = 1 ; i < n ; i++ ){
            mx = Math.max( mx , nums[i]);
        }
        int low = 1 , high = mx , ans = 1 ;
        while(low<=high){
            int sum = 0 ;
            int mid = low + (high - low )/2 ;
            for(int j = 0 ; j < n ; j++){
                if(nums[j] % mid == 0 )
                    sum += nums[j] / mid ;
                else sum += (nums[j] / mid ) + 1;
            }
            if(sum <= threshold ) {
                ans = mid ;
                high = mid - 1;
            }
            else if(sum > threshold ) low = mid + 1;
        }
        return ans ;
    }
}
 */
