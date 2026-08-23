package Infosys;

import java.util.Scanner;

public class _9_DownwardRoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int maxWorkReq = 0 ;
        for(int i = 1 ; i < n ; i++ ){
            int curr = arr[i];
            if( curr >= arr[i-1] )  {
                arr[i] = arr[i-1] - 1 ;
                int workReq = curr - arr[i];
                maxWorkReq = Math.max( workReq , maxWorkReq );
            }
        }

        int days = (int) Math.ceil( Math.sqrt(maxWorkReq));
        System.out.println(days);
    }
}
