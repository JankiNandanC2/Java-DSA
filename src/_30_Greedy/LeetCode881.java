package _30_Greedy;

import java.util.Arrays;

public class LeetCode881 {
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people) ;

            int left = 0 ,  right = people.length - 1 ;
            int boatCount = 0 ;

            while( left <= right ){
                if( people[left] + people[right] <= limit ){
                    left++ ; right-- ;
                }
                else right-- ;
                boatCount++ ;
            }

            return boatCount ;
        }
    }
}
