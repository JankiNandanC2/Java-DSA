package _30_Greedy;

import java.util.Arrays;

public class Leetcode646 {

}

class Solution9 {
    public int findLongestChain(int[][] pairs) {

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        int prevEndPoint = pairs[0][1];
        int count = pairs.length ;

        for(int i = 1 ; i < pairs.length ; i++) {
            int currStartPoint = pairs[i][0] ;
            if ( prevEndPoint >= currStartPoint  ) count-- ; // overlaping so no chainign so remove curr
            else prevEndPoint = pairs[i][1] ;
        }

        return count;
    }
}
