package _07_binarySearch;

public class Leetcode658 {
    /*
    658. Find K Closest Elements
    Solved Medium

    Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
    The result should also be sorted in ascending order.

    */
}

/*
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                high = mid;
            } else
                low = mid + 1;
        }
        int i = low, j = i + 1, count = 0;
        if (arr[low] != x) {
            i = low - 1;
            j = low;
        }
        while ((j < n) && (i >= 0) && (count < k)) {
            if (Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) {
                list.add(arr[i]);
                i--;
            } else {
                list.add(arr[j]);
                j++;
            }
            count++;
        }
        while (count < k) {
            if (i < 0) {
                list.add(arr[j]);
                j++;
            } else {
                list.add(arr[i]);
                i--;
            }
            count++;
        }
        Collections.sort(list);
        return list;
    }
}
 */
