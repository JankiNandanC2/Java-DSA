package _08_Recursion;

import java.util.Scanner;

public class _08_FibonacciNumber {
    public static int fibonacci(int n ){
        if(n==0 || n==1) return n ;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int n = scan.nextInt();
        System.out.println(fibonacci(n));
    }
}
