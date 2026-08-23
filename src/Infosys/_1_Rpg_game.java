package Infosys;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _1_Rpg_game {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int exp = sc.nextInt();
        int[][] arr = new int [n][2];
        for(int i = 0 ; i < n ; i ++ ){
            arr[i][0] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.comparing(a -> a[0]));
        int i = 0 ;
        for( i = 0 ; i < n ; i++ ){
            if( arr[i][0] <= exp ) {
                exp += arr[i][1];
            } else break ;
        }

        System.out.println(i);
    }
}
