/*
class Solution {
    public void nextPermutation(int[] nums) {
        // find the pivot element
        int n = nums.length ;
        int pivotIndex = -1 ;
        for(int i = n-2 ; i>=0 ; i--){
            if(nums[i]< nums[i+1]){
                pivotIndex = i ;
                break ;
            }
        }
        // agar max number h tv
        if(pivotIndex == -1) {
            reverse(nums , 0, n-1);
        }//nahi to
        else {
            reverse(nums , pivotIndex+1 , n-1);
            //swap pivot and its just next  greater elemwnt
            for(int i = pivotIndex+1; i<n ;i++){
                if(nums[i]>nums[pivotIndex]) {
                    // reverse ussi se karo jo element pivot element se just bda ho
                    // reverse(nums , pivotIndex , i );
                    int temp = nums[pivotIndex] ;
                    nums[pivotIndex] = nums[i];
                    nums[i] = temp ;
                    break ;
                }
            }
        }
    }
    public static void reverse(int[] arr , int i , int j ){
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp ;
            i++;
            j--;
        }
    }
}
*/