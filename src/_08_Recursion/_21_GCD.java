package _08_Recursion;

import java.util.Scanner;

public class _21_GCD {
    public static int hcf(int a , int b ){
        int mn = Math.min(a,b);
        for(int i = mn ; i>=0 ; i--){
            if(a%i == 0 && b%i==0) return i ;
        }
        return 1 ;
    }
    /*
    public static int gcd(int a , int b ){
        while(b != 0){
            int temp = b ;
            b = a % b ;  // remainder
            a = temp ;
        }
        return a ;
    }
         */
    public static int gcd(int a , int b ){
        if(b % a == 0 ) return a ;
        return  gcd(b%a , a );
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of first No  : ");
        int a = scan.nextInt();
        System.out.print("Enter value of second no  : ");
        int b = scan.nextInt();
        System.out.println(hcf(a,b));
        System.out.println(gcd(a,b));
    }
}
