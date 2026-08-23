package Infosys;

import java.util.Arrays;
import java.util.Scanner;

public class _8_MaximumVacation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[m] ;

        for(int i = 0 ; i < m ; i++ ){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int maxDays = 0 ;

        if( k >= m ){
            System.out.println(n);
            return;
        }

        int firstVacation = arr[0] - 1;
        maxDays = Math.max(maxDays , firstVacation);
        int lastVacation = n - arr[m-1];
        maxDays = Math.max(maxDays , lastVacation);

        for(int i = k ; i < m ; i++ ){
            int days = arr[i]-1 ;
            if( i - k - 1 >= 0 )  days -= arr[i-k-1];
            maxDays = Math.max(days, maxDays);
        }


        System.out.println("Max : "+maxDays);
    }
}
