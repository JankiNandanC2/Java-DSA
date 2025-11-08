package _01_Array;

import java.util.Scanner;

public class _09_SecondLargestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No Of Elements :  ");
        int n = scan.nextInt();
        System.out.println("Enter Elements Of Array : ");
        int[] num = new int[n];
        int size = num.length;
        for (int i = 0; i <= num.length - 1; i++) {
            num[i] = scan.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size-1 ; i++) {
            max = Math.max(max,num[i]);
        }
        System.out.println("max element is : "+ max );


        int sMax = Integer.MIN_VALUE;
        for (int i = 0; i <= size -1  ; i++) {
//            if((sMax < num[i]) && ( num[i] != max )){
//                sMax = num[i];
//            }
            if(num[i] != max ){
                sMax = Math.max(sMax, num[i]);
            }
        }
        System.out.println("2nd max element is : "+sMax);
        System.out.println();
    }
}