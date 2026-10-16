package _29_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode46Permutation {
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ;

        backtrack(result , nums , new ArrayList<>());

        return result ;
    }
    public void backtrack( List<List<Integer>> result , int[] nums ,List<Integer> perm ){

        if( perm.size() == nums.length ){
            result.add(new ArrayList<>(perm));
            return ;
        }

        for(int i = 0 ; i < nums.length ; i++ ){
            if( perm.contains(nums[i])) continue ;

            perm.add(nums[i]) ;

            backtrack(result , nums , perm );

            perm.remove(perm.size() - 1 );
        }
    }
}