package _10_CycleSort;

public class _01_Leetcode287 {
}

// using cycleSort
/*
class Solution {
    public void swap(int i , int j ,int[] arr){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public int findDuplicate(int[] arr) {
        while(true){
            int value = arr[0];
            if(value == arr[value]) return value ;
            swap(0 , arr[0] , arr);
        }
    }
}
 */

// hashMap
/*
class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int i = 0 ;
        for( i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])) return nums[i];
            else map.put(nums[i],i);
        }
        return nums[i];
    }
}
 */