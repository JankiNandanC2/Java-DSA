package _30_Greedy;

import java.util.Arrays;

public class LeetCode435 {
}
class Solution8 {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int prevEndPoint = intervals[0][1];
        int eraseCount = 0;

        for(int i = 1 ; i < intervals.length ; i++) {
            if ( prevEndPoint > intervals[i][0] ) {
                eraseCount++;
            } else prevEndPoint = intervals[i][1] ;
        }

        return eraseCount;
    }
}