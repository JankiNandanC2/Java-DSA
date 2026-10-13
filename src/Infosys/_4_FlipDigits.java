package Infosys;

import java.util.Scanner;
import java.math.BigInteger;

public class _4_FlipDigits {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
//        scan.nextLine();
        int cash = scan.nextInt();
        int a = scan.nextInt(); // swapping cost
        int b = scan.nextInt(); // flipping cost

        StringBuilder s = new StringBuilder(str);
        if( a < b ){
            cash = swap( s , cash , a );
            cash = flip( s , cash , b );
        }else {
            cash = flip( s , cash , b );
            cash = swap( s , cash , a );
        }
        // System.out.println(Long.parseLong(s.toString() , 2));
        //System.out.println(new BigInteger(s.toString() , 2 ));

        int MOD = 1_000_000_007 ;
//        int number = 0 , power = s.length() - 1 ;
//        for(int i = 0 ; i < n ; i++ ){
//            int val = 0 ;
//            if( s.charAt(i) == '1') val = (int) Math.pow(2 , power ) % MOD ;
//            number += val ; power-- ;
//        }

        int number = 0 ;
        int base = 2 ;
        for( int i = 0 ; i < s.length() ; i++ ){
            int currBitValue = s.charAt(i) -'0' ;
            // number = ( number * base + newDigit ) -- for any base 2,10 etc
            number = ( number * base + currBitValue ) % MOD ;
        }
        System.out.println(number);
    }
    public static int swap(StringBuilder s , int cash , int cost ){
        if( cash < cost ) return cash ;
        int right = s.length()-1 ;
        int left = 0 ;
        while( left < right  ){
            while(  left < right && s.charAt(left) == '0'  ) left++ ;

            while(right > left && s.charAt(right) == '1'  ) right-- ;

            if( left >= right) break;

            // swap the numbers
            if( cash - cost >= 0 ){
                cash -= cost ;
                s.setCharAt(left,'0');
                s.setCharAt(right, '1');
            }else break ;
        }
        return cash ;

    }
    public static int flip(StringBuilder s , int cash , int cost ){
        if( cash < cost ) return cash ;
        for(int i = 0 ; i < s.length() ;i++ ){
            char ch = s.charAt(i);
            if( ch == '1'){
                if( cash - cost >= 0 ){
                    s.setCharAt(i,'0');
                    cash -= cost ;
                }
                else break;
            }
        }
        return cash ;
    }
}