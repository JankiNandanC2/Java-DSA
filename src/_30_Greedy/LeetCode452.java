package _30_Greedy;

import java.util.Arrays;

public class LeetCode452 {
}
class Solution7 {
    public int findMinArrowShots(int[][] points) {
        // sort on the basis of starting point
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int[] curr = points[0];
        int arrows = 1;

        for (int i = 1; i < points.length; i++) {
            if (curr[1] < points[i][0]) {
                curr = points[i];
                arrows++;
            } else curr[1] = Math.min(curr[1], points[i][1]);
        }

        return arrows;
    }
}