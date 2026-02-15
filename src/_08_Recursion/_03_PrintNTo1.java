package _08_Recursion;

import java.util.Scanner;

public class _03_PrintNTo1 {
    public static void printDecreasing(int n ){
        if(n==0) return ;  // Base Case
        System.out.print(n+" "); // work
        printDecreasing(n-1);  // call
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = scan.nextInt();
        printDecreasing(n);
    }
}
