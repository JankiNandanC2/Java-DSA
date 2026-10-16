package _30_Greedy;

import java.util.Arrays;

public class Leetcode1005 {
    public static class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            Arrays.sort(nums) ;
            int i = 0 ;
            while( (i < nums.length) && (k > 0)){
                if( nums[i] >= 0 ) break ; // break jaise hi positve number dikh jaye
                nums[i] *= -1 ;
                k-- ;
                i++ ;
            }

// ODD CASE - negating the smallest element
            if( k % 2 != 0 ){
                Arrays.sort(nums);
                nums[0] *= -1 ;
            }

            // now find the sum
            int sum = 0 ;
            for(int ele : nums) sum += ele ;

            return sum ;
        }
    }
    public static void main(String[] args ){
        int[]  nums = {2,-3,-1,5,-4} ;
        int k = 2 ;
        Solution solution = new Solution();
        solution.largestSumAfterKNegations(nums , k ) ;
    }
}
