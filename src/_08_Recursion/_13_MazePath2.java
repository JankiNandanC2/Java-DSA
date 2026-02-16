package _08_Recursion;

import java.util.Scanner;

public class _13_MazePath2 {
    public static int maze2(int m , int n){
        if(m == 1 || n == 1 ) return 1 ;
        int rightWays = maze2( m, n-1);
        int downWays = maze2( m-1 , n);
        return rightWays + downWays ;
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter m (rows) : "); // row no
        int m = scan.nextInt();
        System.out.print("Enter n (cols) : "); // col no
        int n = scan.nextInt();
        System.out.println(maze2(m,n));
    }
}
