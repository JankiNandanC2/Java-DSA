package _07_binarySearch;

import java.util.Arrays;

public class leetcode34_method2 {
    static void main(String[] args) {
        int[] arr ={10,10,20,20,20,20,20,30,30,30,40,40,};
        int target = 20 ;
        int[] sol = firstAndLastPosition(arr, target);
        System.out.println(Arrays.toString(sol));
    }
    public static int[] firstAndLastPosition(int[] arr, int x){
        int[] ans = {-1,-1};
        int firstOccurrence = -1  ;
        int n = arr.length ;
        int low = 0 , high = n-1 ;
    // finding first appearance
        while(low <= high){
            int mid = low + ((high -low)/2);
            if(arr[mid]==x){
                if(arr[mid]==arr[mid-1] && mid > 0)  high = mid-1 ;
                else {
                    firstOccurrence = mid;
                    break;
                }
            }
            else if(arr[mid]> x) high = mid - 1 ;
            else if (arr[mid]< x) low = mid + 1;
        }
        ans[0] = firstOccurrence ;
    // finding last appearance
        int lastOccurrence = -1 ;
        low = 0 ; high = n-1 ;
        while (low <= high ){
            int mid = low + (high -low)/2 ;
            if(arr[mid] == x){
               if(mid < n-1 && arr[mid] == arr[mid+1]) low = mid+1 ;
               else {
                   lastOccurrence = mid;
                   break;
               }
            }
            else if (arr[mid] > x) high = mid - 1 ;
            else if (arr[mid] < x) low = mid + 1;
        }
        ans[1] = lastOccurrence  ;
        return ans;
    }
}
