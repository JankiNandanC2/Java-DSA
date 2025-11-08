package _01_Array;

import java.util.Scanner;

public class _02_InputOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No of elements : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for( int i = 0 ; i <= n-1 ; i++){
             arr[i] = scan.nextInt();
        }
        for( int i = 0 ; i <= n-1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
