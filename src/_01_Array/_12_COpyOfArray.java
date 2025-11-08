package _01_Array;

import java.util.Arrays;

public class _12_COpyOfArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        print(arr);
        // shallow copy -- same array
        int[] nums = arr;
        print(nums);
//        System.out.println();
        nums[0]=44;
        print(nums);
//        System.out.println(arr[0]);
//        System.out.println();

        // deep copy
        int[] brr = Arrays.copyOf(arr,arr.length);
        print(brr);
        brr[0]= 99 ;
//        System.out.println(arr[0]);
        print(brr);
        // 2nd option

        int[] crr = new int[arr.length];
        print(crr);
        crr[0]= 299;
//        System.out.println(arr[0]);
        print(crr);
    }
    public static void print(int[] nums){
        for (int i = 0; i <= nums.length-1 ; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
