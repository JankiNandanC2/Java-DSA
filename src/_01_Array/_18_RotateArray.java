package _01_Array;
import java.util.Scanner;
public class _18_RotateArray {
    public static void main(String[] args){
        int[] nums = {10,20,30,40,50,60,70};
        for(int ele: nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        int n = nums.length ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Steps to Be Rotated : ");
        int k = scan.nextInt();
        k = k % n;

        swap(nums,0,n-k-1);
        for(int ele: nums){
            System.out.print(ele+" ");
        }
        System.out.println();

        swap(nums,n-k,n-1);
        for(int ele: nums){
            System.out.print(ele+" ");
        }
        System.out.println();

        swap(nums,0,n-1);
        for(int ele: nums){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] nums , int a , int n){
        int j = n ;
        int i = a ;
        while(i<j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
