package _20_HashSetAndHashMap;

import  java.util.HashSet ;

public class LeetCode2442 {
    class Solution {
        public int reverseDigit(int n ){
            int reverse = 0 ;
            while( n > 0 ){
                int lastDigit = n % 10 ;
                reverse = (reverse * 10 ) + lastDigit  ;
                n = n/10 ;
            }
            return reverse ;
        }
        public int countDistinctIntegers(int[] nums) {
            HashSet<Integer> set = new HashSet<>() ;
            int count = 0 ;

            for(int i = 0 ; i < nums.length ; i++){
                set.add( nums[i]) ;
                set.add( reverseDigit( nums[i] )) ;
            }

            return set.size() ;
        }
    }
}
