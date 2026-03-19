package _06_basicSortingAlgorithm;

import java.util.Collection;
import java.util.Collections;

//  push zeroes to end by maintaining relative order
public class _04_pushZeroToEnd {
    static void main() {
        // leetcode 283
    }
}
//using bubble sort
/*
class Solution {
    public void moveZeroes(int[] nums) {
        for (int x = 0; x < nums.length - 1; x++) {
            boolean flag = true ;
            for (int i = 0; i < nums.length - x - 1; i++) {
                if (nums[i] == 0) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                    flag = false ;
                }
            }
            if(flag==true) break ;
        }
    }
}
 */

//optimised
/*
class Solution {
    public void moveZeroes(int[] nums) {
        // optimised
        int lnze = 0; // lastNonZeroElement
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lnze];
                nums[lnze] = temp;
                lnze++;
            }
        }
    }
}
 */