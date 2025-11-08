package _03_Strings;

import java.util.Scanner;


public class _12_NumberOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* using loop
        int num = scan.nextInt();
        int count= 0 ;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println(count);*/
//  without use of loop
        // using inbuilt string function
//        int num = scan.nextInt();
//        String str = Integer.toString(num);
//        System.out.println(str.length());

        // or
        int nums = scan.nextInt();
        String s = ""+ nums;
        System.out.println(s.length());

        // long to string
    }
}
