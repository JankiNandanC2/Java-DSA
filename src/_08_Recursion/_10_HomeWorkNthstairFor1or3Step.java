package _08_Recursion;

import java.util.Scanner;

// either 1 step or 3 step at a time

public class _10_HomeWorkNthstairFor1or3Step {
    public static int stair(int n ){
        if(n==1 || n==2 ) return 1 ;
        if(n==3) return 2 ;
        return stair(n-1)+ stair(n-3);
    }
    static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number  : ");
            int n = scan.nextInt();
            System.out.println(stair(n));
    }
}
