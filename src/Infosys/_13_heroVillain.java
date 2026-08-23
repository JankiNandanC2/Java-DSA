package Infosys;

import java.util.Scanner;

public class _13_heroVillain {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // no of villain
        int hero = scan.nextInt(); // no of hero
        int health = scan.nextInt(); // health of hero

        int[] vill = new int[n]; // to store villain health of ith villain
        for(int i = 0;i < n ; i++){
            vill[i] = scan.nextInt();
        }

        int h = 1 ; // to track hero
        int v = vill.length - 1  ;
        int currH = health ; // current Health

        while( h <= hero && v  >= 0  ){
            if( currH == vill[v]) {
                currH = health ;
                v-- ;
                h++ ;
            }
            else if( currH > vill[v]){
                currH  -= vill[v];
                v-- ;
            }else if( currH < vill[v]){
                h++ ;
                currH = health ;
            }
        }

        int ans = 0 ;
        // all defeated
        if( v < 0 ){
            ans = 0 ;
        }else { // all not defeated
            ans = v+1 ; // remaining villain
        }
        System.out.println(ans);
    }
}
