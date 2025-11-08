package _01_Array;

import java.util.Scanner;

public class _08_MaximumValueOfAllElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No Of Elements :  ");
        int n = scan.nextInt();
// input
        System.out.println("Enter Elements Of Array : ");
        int[] num = new int[n];
        for (int i = 0; i <= num.length - 1; i++) {
            num[i] = scan.nextInt();
        }

        // method 1
//        int mx = num[0];
//        for (int i = 1; i <= num.length - 1; i++) {
//            if(mx<num[i])
//                mx = num[i];
//        }

        // method 2 ---
        int mx = Integer.MIN_VALUE;
        for (int i = 0 ; i <= num.length - 1; i++) {
//            if(mx<num[i])
//                mx = num[i];
            mx= Math.max(mx , num[i]);
        }
        System.out.println("largest element is : "+mx );
    }
}
