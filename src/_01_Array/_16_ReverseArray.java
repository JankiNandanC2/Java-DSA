package _01_Array;

public class _16_ReverseArray {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60};
        for(int ele: nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        // using two pointer --- while loop
        int j = nums.length-1;
        int i = 0 ;
        while (i<j){
            swap(nums,i, j);
            i++;
            j--;
        }
        for(int ele: nums){
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}