package _07_binarySearch;
// you can solve it by linear search but time complexity will be O(n) --- solve it in log(n)
// solved n leetcode
public class Leetcode33_searchInRRotatedArray {
}

// better method
class Solution {
    public int search(int[] nums, int target) {

        int low = 0 , high = nums.length - 1 ;

        while( low <= high ){
            int mid = low + ((high - low )/2 );

            if(nums[mid] == target ) return mid ;

            else if( nums[low] <= nums[mid]){
                if( target >= nums[low] && target < nums[mid])
                    high = mid -1 ;
                else low = mid + 1;
            }

            else if( nums[mid] <= nums[high]) {
                // we have a right sorted half so check target is there
                if( target > nums[mid] && target <= nums[high])
                    low = mid + 1 ;
                else high = mid -1 ;
            }
        }
        return -1 ;
    }
}



// method 2 -- not recommended ---> just tried by me and worked
/*
class Solution {
    public int binarySearch(int low , int high , int[] nums){
       while( low <= high ){
            int mid = low + ((high - low )/2 );
            if ( nums[mid] == target ) return mid ;
            if( nums[mid] > target ) high = mid -1 ;
            else low = mid +1 ;
        }
        return -1 ;
    }
    public int search(int[] nums, int target) {
        int n = nums.length ;
        int low = 0 , high = n -1 ;

        int pivotIndx = 0 ;

        while( low <= high ){
            int mid = low + ((high - low )/2 );
            if( nums[mid] >= nums[mid-1] || nums[mid] > nums[mid+1]) {
                pivotIndx = mid ;
                break ;
            }
            else if( nums[mid] <= nums[mid+1] && nums[mid] < nums[n-1]){ // right
                high = mid -1 ;
            }
            else low = mid +1 ;
        }

        if( target >= arr[0] && target <= nums[pivotIndx])
            return binarySearch(0 , pivotIndx , nums);

        return binarySearch(pivotIndx+1 , n-1 , nums );
    }
}
 */