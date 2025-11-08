package _01_Array;
// dutch flag method 
public class _23_SortZeroOneTwoDutchFlagMethod {
    public static void main(String[] args) {
//        int[] nums = {2,0,2,1,1,0};
        int[] nums = {2,0,1};
        for(int ele : nums){
            System.out.print(ele+ " ");
        }
        int n = nums.length;
        System.out.println();
        int low = 0 , mid = 0 , high = n-1 ;
        while(mid<=high){
            if(nums[mid]==0 ){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1 ) mid++ ;
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }
        System.out.println();
        for(int ele : nums){
            System.out.print(ele+ " ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
}
