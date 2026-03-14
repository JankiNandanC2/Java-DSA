package _10_CycleSort;

public class _04_Leetcode41 {
}
// optimised
/*
class Solution {
    public void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length, i = 0;
        while (i < n) {
            if (nums[i] <= 0 || nums[i] > n || nums[i] == (i + 1))
                i++;
            else {
                int indx = nums[i] - 1;
                if (nums[i] == nums[indx])
                    i++;
                else
                    swap(i, nums[i] - 1, nums);
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != (i + 1))
                return i + 1;
        }
        return i + 1;
    }
}
 */

// hashSet
/*
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length ;
        HashSet<Integer> set = new HashSet<>();
         for(int i = 0 ; i < n ; i++){
            set.add(nums[i]);
        }
        for(int i = 1 ; i <= n+1 ; i++){
            if( ! set.contains(i) ) return i ;
        }
        return n ;
    }
}
 */

// brute Force approach  - by myself
/*
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0 , n = nums.length ;
        if(n==1){
            if(nums[0] == 1)return 2;
            return 1 ;
        }
        Arrays.sort(nums);
        while((i < n ) && nums[i] <= 0) i++;
        if(i>=n) return 1 ;
        int minPosVal = 1 ;
        while(i<n){
            if(nums[i] == minPosVal ) minPosVal++;
            if( i<=n-1 && nums[i]<=minPosVal) i++;
            else if(nums[i] != minPosVal ) return minPosVal ;
        }
        return minPosVal ;
    }
}
 */