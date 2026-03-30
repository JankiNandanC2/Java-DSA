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
// solved today -- 28 march myself **
/*
class Solution {
    public int noOfShopsCovered(int[] arr , int mid ){
        int shopsCount = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            shopsCount += (arr[i] + mid - 1) / mid; // ceil division (*********) easy way to find ceil division value
        }
        return shopsCount ;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int size = quantities.length ;
        int mx = quantities[0];
        // if(size <= 1) return mx ; ---> not neededed bhai
        for(int i = 1; i < size ; i++){
            mx = Math.max(mx , quantities[i]);
        }
        int low = 1 , high = mx , ans = mx ;
        while(low <= high ){
            int mid = low + (high - low) / 2 ;
            int no  = noOfShopsCovered(quantities , mid );
            if(no <= n ){
                ans = Math.min(ans , mid );
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans ;
    }
}
 */
