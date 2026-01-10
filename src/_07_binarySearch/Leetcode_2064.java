package _07_binarySearch;

// goood ques secially ispossibe method part m bahot time lga starting m sochne m
// av to easy o gya

public class Leetcode_2064 {
    /*
    class Solution {
        public static boolean isPossible(int maxQty , int[] arr , int n){  // mid == maxQty
            int noOfStores = 0 ;
            for(int i = 0 ; i < arr.length ; i++){
               if(arr[i]% maxQty == 0)
                    noOfStores += arr[i]/maxQty ;
               else
                    noOfStores += arr[i]/maxQty + 1 ;
            }
            if(noOfStores <= n ) return true ;
            else return false ;
        }
        public int minimizedMaximum(int n, int[] arr) {
            int length = arr.length ;
            int mx = Integer.MIN_VALUE;
            for(int i = 0 ; i< length ; i++){
                mx = Math.max(mx , arr[i]);
            }
            int low = 1 , high = mx , ans = mx  ;
            while(low<=high){
                int mid = low + (high -low)/2 ;
                boolean possible = isPossible(mid, arr , n);
                if(possible){
                    ans = mid ;
                    high = mid -1 ;
                }
                else low = mid + 1;
            }
            return ans ;
        }
    }
 */
}
