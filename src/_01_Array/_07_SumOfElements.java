package _01_Array;

import java.util.Scanner;

public class _07_SumOfElements {
    public static void main(String[] args) {
//        Scanner scan =new Scanner(System.in);
//        System.out.println("Enter No Of Elements :  ");
//        int n = scan.nextInt();
//        int[] num;
//        num = new int[n];
//        System.out.println("Enter Elements Of Array : ");
//        for (int i = 0; i <= num.length-1 ; i++) {
//            num[i]= scan.nextInt();
//        }
        int[] num = {10, 10 ,1334, 478, 23787 , 3323, 3222, 44};
        int sum = 0 ;
        for (int i = 0; i <= num.length-1 ; i++) {
            sum +=num[i] ;
        }
        System.out.println("sum of Elements : "+ sum);
    }
}
