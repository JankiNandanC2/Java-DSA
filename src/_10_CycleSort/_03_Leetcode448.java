package _10_CycleSort;

public class _03_Leetcode448 {

}
// cycle Sort  optimised
/*
class Solution {
    public void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if ((i + 1) == nums[i] || (nums[i] == nums[nums[i] - 1]) )
                i++ ;
            else swap(i , nums[i] - 1 , nums);
        }
        List<Integer> list = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if ((i+1) != nums[i] )
                list.add(i + 1);
        }
        return list;
    }
}
 */