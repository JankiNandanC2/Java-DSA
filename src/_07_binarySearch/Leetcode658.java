package _07_binarySearch;

import java.util.ArrayList;
import java.util.List;

public class Leetcode658 {
    /*
    658. Find K Closest Elements
    Solved Medium

    Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
    The result should also be sorted in ascending order.

    */
}


// better approach avoids collection.sort
// time complexity --> O( logn + k )
class BetterSolution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int n = arr.length ;
        List<Integer> list = new ArrayList<>();

        int low = 0 , high = n-1 ;
        int indx = n ; // indx of lowerbound of x

        while(low <= high ){
            int mid = low + (high -low)/2;
            if( arr[mid] >= x ){
                indx = mid ;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        // now find the k closest
        int left = indx-1 , right = indx ;

        for(int i = 0 ; i < k ; i++){
            if( left < 0 ) right++ ;
            else if( right >= n ) left-- ;
            else if( Math.abs(arr[left]-x) <= Math.abs(arr[right] - x)) left--;
            else right++;
        }

        //add to list
        for(int i = left+1 ; i < right ; i++)
            list.add(arr[i]);

        return list ;
    }
}


/*
time complexity O( n log n ) or O ( log n + k log k )
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
