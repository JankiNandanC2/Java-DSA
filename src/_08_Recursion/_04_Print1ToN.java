package _08_Recursion;

import java.util.Scanner;

public class _04_Print1ToN {
    /*
    static int n ; // global variable --> not preferred
    public static void printIncreasing1(int x) {
        if(x>n) return;  // base case
        System.out.print(x+" ");  // work
        printIncreasing1(x+1); //  call
    }
     */

    // using extra parameter
    public static void printIncreasing1(int x , int n ) {
            if(x>n) return;  // base case
            System.out.print(x+" ");  // work
            printIncreasing1(x+1 , n ); //  call
    }

    // using recursive call
    public static void printIncreasing2(int n) {
        if(n==0) return;  // BaseCase
        printIncreasing2(n-1); // call
        System.out.print(n+" ");  // work
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = scan.nextInt();
        printIncreasing1(1 , n ); // method 1
        System.out.println();
        printIncreasing2(n);  // method 2
    }
}
