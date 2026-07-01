package _20_HashSetAndHashMap;


import java.util.HashMap;

public class LeetCodeTwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            HashMap<Integer,Integer> map = new HashMap<>() ;

            for (int i = 0; i < nums.length ; i++) {
                if( map.containsKey( target - nums[i]))
                    return new int[]{ map.get( target - nums[i] ) , i } ;
                map.put( nums[i] , i ) ;
            }

            return new int[]{ 1, 1};
        }
    }

    // brute force approach
    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            for (int i = 0; i <= nums.length - 2; i++) {
                for (int j = i + 1; j <= nums.length - 1; j++) {
                    if (nums[i] + nums[j] == target) {
                        ans[0] = i;
                        ans[1] = j;
                        break ;
                    }
                }
            }
            return ans;
        }
    }

}
