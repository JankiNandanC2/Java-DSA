package _01_Array;

public class _28_NextGreatestElement {
    public static void main(String[] args){
        int[] nums = {12,8,60,37,2,49,16,28,21};
        for(int ele:nums){
            System.out.print(ele+" ");
        }
        int n = nums.length;
        int[] arr= new int[n];
        int mx = -1 ;
        for(int i = n-1 ; i>=0 ; i--){
            arr[i]=mx;
            mx= Math.max(mx , nums[i]);
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
