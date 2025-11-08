package Practice;

import java.util.Scanner;

public class _1_fibonacciSeries {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibo(n);
//        // meth0d 2
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibo(i) + " ");
//        }
    }
// method 1 
    /*
    static void fibo(int n ){
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1 ;
        for (int i = 2; i <= n ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int ele :arr){
            System.out.print(ele+" ");
        }
    }
    */

// method 2
    /*
    public static int fibo(int n ) {
        if (n == 0 ) return 0;
        if (n == 1 ) return 1;
        else {
             return fibo(n - 1) + fibo(n - 2) ;
        }
    }
    */

// method 3
    public static void fibo(int n) {
        int a = 0 , b = 1   ;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next+" ");
            a  = b;
            b = next;
        }
   }
}