package Infosys;

import java.util.Arrays;
import java.util.Scanner;

public class _12_MMinimumNumberOfExerciseInGivenEnergy {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int energy = scan.nextInt();
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i < n ; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr) ;
        int count = 0 ;

        for(int i = n-1  ;  i >= 0 ; i-- ) {
            energy -= arr[i] ;
            count++ ;

            if( energy <= 0 )
                break;

            energy -= arr[i];
            count++ ;
            if (energy <= 0) break;

        }

//        if( energy < 0 ) count-- ; wrong

        int ans = count ;
        if( energy > 0 ) ans = -1 ;
        System.out.println(ans);
    }
}
