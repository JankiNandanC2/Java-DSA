package _08_Recursion;

import java.util.Scanner;

// myself

public class _11_MazePath {
    public static int mazePath(int i , int j ,int n ){
        if(i==n || j==n ) return 1 ;
        return mazePath(i+1, j,n) + mazePath(i,j+1,n) ;
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int n = scan.nextInt();
        // n*n ka matrix
        System.out.println(mazePath(1,1,n));
    }
}
