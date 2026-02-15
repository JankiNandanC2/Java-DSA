package _08_Recursion;

// calculate a raised to Ppwer b using recursion

import java.util.Scanner;

public class _06_Power {
    // time complexity == O(power)
    public static int power(int b , int p){
        if( p==0 ) return 1 ;
        return b * power(b,p-1);
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base value  : ");
        int base = scan.nextInt();
        System.out.println("Enter Power value  : ");
        int pow = scan.nextInt();
        if(base == 0 && pow == 0 ) System.err.println("Not Defined");
        else System.out.println("a raised to power b is :  "+power(base,pow));
    }
}
