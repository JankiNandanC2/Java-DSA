package _08_Recursion;

import java.util.Scanner;

public class _12_MazePathBySir {
    public static int maze(int row , int col , int m , int n){
        if(row == m || col == n ) return 1 ;
        /*
        if(row == m && col == n) return 1 ;
        if(row>m || col>n) return 0 ;
         */
        int rightWays = maze(row , col+1 , m , n);
        int downWays = maze(row+1 , col , m , n);
        return rightWays + downWays ;
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter m (rows) : "); // row no
        int m = scan.nextInt();
        System.out.print("Enter n (cols) : "); // col no
        int n = scan.nextInt();
        System.out.println(maze(1,1,m,n));
    }
}
