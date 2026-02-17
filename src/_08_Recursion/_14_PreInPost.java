package _08_Recursion;

import java.util.Scanner;

public class _14_PreInPost {
    public static void pip(int n ){
        if(n==0) return ;
        System.out.print(n+" ");
        pip(n-1);    // pre
        System.out.print(n+" ");  // in
        pip(n-1);    // post
        System.out.print(n+" ");
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        pip(n);  // zig zag
    }
}
