package Infosys;

import java.util.Scanner;

public class _10_MountainArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i < n ; i++){
            arr[i] = scan.nextInt();
        }
        int mid = n/2 ;
        int value = arr[n/2] , changes = 0 ;
        int left = mid -1  , right = mid + 1 ;

        // even case
        if ( n % 2 == 0 ){
            mid = n/2 - 1 ;
            value = arr[mid];
            if( arr[mid] != arr[mid+1])
                changes++ ;
            left = mid - 1 ;
            right = mid + 2 ;
        }

        while( left >= 0 && right < n){
            value-- ;
            if( arr[left] != value ) changes++;
            if( arr[right] != value ) changes++;

            left-- ;
            right++ ;
        }

        System.out.println(changes);
    }
}
