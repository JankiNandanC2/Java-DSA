package _01_Array;

public class _17_ReverseArrayUsingForLopp {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80};
        for(int ele: nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        int n = nums.length;
        for(int i =0 ; i< n/2 ; i++ ){
//            int temp = nums[i];
//            nums[i]= nums[n-1-i];
//            nums[n-1-i] = temp;
            swap(nums,i,n-1-i);
        }
        System.out.println();
        for(int ele : nums){
            System.out.print(ele+" ");
        }
    }

    private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp;
     }
}
