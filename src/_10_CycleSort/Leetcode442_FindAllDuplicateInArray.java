package _10_CycleSort;

public class Leetcode442_FindAllDuplicateInArray {

}
// optimised - cycle sort
/*
class Solution {
    public void swap(int i , int j ,int[] arr){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0 ;
        while(i < nums.length ){
            int indx = nums[i] - 1 ; //correct index of i element
            if(nums[i] == (i+1) || nums[i] == nums[indx] ) i++ ;
            else swap(i, indx , nums) ;
        }
        List<Integer> list = new ArrayList<>();
        for( i = 0 ; i< nums.length ; i++){
            if(nums[i] != (i+1)) list.add(nums[i]);
        }
        return list ;
    }
}
 */

// hashSet
/*
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i< nums.length ; i++){
            if(set.contains(nums[i])) list.add(nums[i]);
            set.add(nums[i]);
        }
        return list ;
    }
}
 */

// HashMap
/*
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i< nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i] , 0)+1);
            if(map.get(nums[i]) > 1)  list.add(nums[i]);
        }
        return list ;
    }
}
 */

