package _08_Recursion;

import java.util.Scanner;

public class _05_PrintSumFrom1ToN {
    /*
    // without return type  -- 0
    public static void sum1(int n, int s ){
        if(n==0) {
            System.out.println(s);
            return ;
        }
        sum1(n-1 , s+n);  // call and work
    }
    // using extra parameter  -- 1
    public static int sum(int  x , int n ){
        if(n==0) return 0 ;
        if(x==n) return n;
        return x+sum(x+1,n);
    }
     */
    // recursive call  -- 2 ****
    public static int sum(int n ){
        if(n==1 || n==0) return n ;
        return n + sum(n-1) ;
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = scan.nextInt();
        /*
        // Method 0
        sum1(n , 0) ;
        // Method 1
        System.out.println(sum(1,n)); // parametrised way
         */
        System.out.println(sum(n)); // recursive
    }
}
