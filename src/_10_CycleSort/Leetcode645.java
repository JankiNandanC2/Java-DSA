package _10_CycleSort;

public class Leetcode645 {
}
/*
class Solution {
    public void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == (i + 1))
                i++;
            else {
                int indx = nums[i] - 1;
                if (nums[i] == nums[indx])
                    i++;
                else
                    swap(i, indx, nums);
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1)) {
                ans[0] = nums[i];
                ans[1] = i + 1;
                return ans;
            }
        }
        return ans;
    }
}
 */
