package _08_Recursion;

import java.util.Scanner;

// either 1  or 2 step at a time for the nth stair

public class _09_NthStairWays {
    public static int stairWays(int n ){
        if(n==1 || n==2 ) return n ;
        return stairWays(n-1)+ stairWays(n-2);
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int n = scan.nextInt();
        System.out.println(stairWays(n));
    }
}
