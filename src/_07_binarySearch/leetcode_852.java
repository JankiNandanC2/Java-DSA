package _07_binarySearch;
/*
852. Peak Index in a Mountain Array
Solved  Medium
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
*/

// soled n leetcode
public class leetcode_852 {
    static void main(String[] args) {
        // solved on leetcode
    }
}

/*
class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid + 1])
             // means hm descending slope par hai so mide ys useke left m peak element ho skata hai
                high = mid;
            else
            // mtlb ascennding slope par hai mlb mid ke right me peak element hoga
                low = mid + 1;
        }
        return high;
    }
}
 */
