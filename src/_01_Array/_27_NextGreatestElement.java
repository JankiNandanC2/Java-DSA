package _01_Array;
// brute force approach
public class _27_NextGreatestElement {
    public static void main(String[] args ){
        int[] nums = {12,8,41,37,2,49,16,28,21};
        for(int ele:nums){
            System.out.print(ele+" ");
        }
        int n = nums.length;
        int[] arr= new int[n];
        for(int i = 0 ; i<= n-2; i++){
            int mx = Integer.MIN_VALUE;
            for (int j = i+1; j <= n-1; j++) {
                mx = Math.max(mx,nums[j]);
            }
            arr[i]=mx ;
        }
        arr[n-1]= -1 ;
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
