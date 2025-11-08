package _01_Array;

import java.util.Scanner;

public class _19_RotateArrayEasy {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70};
        for (int ele : nums) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int n = nums.length;
        System.out.println("Enter Steps to Be Rotated : ");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        k= k%n;
        // using a new array  to rotate the array
        int[] arr = new int[nums.length];
        int j = 0 ;
        for (int i = n-k; i < arr.length; i++) {
            arr[j] = nums[i];
            j++;
        }
        for(int l = 0 ; l <= (n-k-1) ; l++ ){
            arr[j]= nums[l];
            j++;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}