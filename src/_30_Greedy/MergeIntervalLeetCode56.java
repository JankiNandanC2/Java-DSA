package _30_Greedy;

import java.util.*;

public class MergeIntervalLeetCode56 {
}

// second try myself
/*
class Solution99 {
    public int[][] merge(int[][] arr) {
        if( arr.length == 1) return arr ;
        ArrayList<int[]> list = new ArrayList<>();

        Arrays.sort( arr , (a, b) -> {
            if( a[0] == b[0]) return Integer.compare(a[1] ,b[1]) ;
            return Integer.compare( a[0],b[0] ) ;
        });

        int i = 1 , j = 0 ;
        while( i < arr.length ){
            while( i < arr.length && arr[j][1] >= arr[i][0]){
                arr[j][1] = Math.max( arr[j][1] , arr[i][1] ) ;
                i++ ;
            }
            list.add(arr[j]);
            j = i ;
            i++ ;
        }

        int n = list.size();
        if(list.get(n-1)[1] < arr[arr.length -1 ][0]){
            list.add(arr[arr.length -1 ]);
        }

        int[][] ans = new int[list.size()][2];
        int indx = 0 ;
        for(int[] a : list ) ans[indx++] = a ;
        return ans  ;
    }
} */


class Solution991 {
    public int[][] merge(int[][] arr) {
        ArrayList<int[]> list = new ArrayList<>();

        Arrays.sort( arr , (a, b) -> Integer.compare( a[0],b[0]) );

        int[] curr = arr[0];

        for(int i = 1 ; i < arr.length ; i++ ){
            if( curr[1] >= arr[i][0]){
                curr[1] = Math.max( curr[1] , arr[i][1]);
            }
            else{
                list.add(curr);
                curr = arr[i] ;
            }
        }

        // for last element
        list.add(curr);

        return list.toArray(new int[list.size()][]);
    }
}

class Solution992 {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length; // row size
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = Math.max(intervals[i][1], intervals[i + 1][1]);
            } else
                list.add(Arrays.asList(intervals[i][0], intervals[i][1]));
        }
        // add the last element
        list.add(Arrays.asList(intervals[n - 1][0], intervals[n - 1][1]));

        int[][] ans = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }

        return ans;
    }
}