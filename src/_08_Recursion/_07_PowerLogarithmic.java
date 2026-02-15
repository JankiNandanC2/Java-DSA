package _08_Recursion;

import java.util.Scanner;

// logarithmic method  ---- time complexity is -->  log b

public class _07_PowerLogarithmic {
    public static int powerLog(int b , int p ){
        if(p==0) return 1 ;
        int ans = powerLog(b, p/2) ;
        if(p%2 == 0) return ans * ans;
        else return  ans * ans * b  ;
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base value  : ");
        int base = scan.nextInt();
        System.out.println("Enter Power value  : ");
        int pow = scan.nextInt();
        if(base == 0 && pow == 0 ) System.err.println("Not Defined");
        else System.out.println("a raised to power b is :  "+powerLog(base,pow));
    }
}
