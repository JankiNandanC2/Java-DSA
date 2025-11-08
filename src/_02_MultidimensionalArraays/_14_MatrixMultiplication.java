package _02_MultidimensionalArraays;
import java.util.*;
public class _14_MatrixMultiplication {
    public static void input(int[][] arr) {
        Scanner scan =new Scanner(System.in);
        for(int i = 0 ; i < arr.length ;i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                 arr[i][j] = scan.nextInt();
            }
        }
    }
    public static void print(int[][] arr) {
        for(int i = 0 ; i < arr.length ;i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void multiply(int[][]a , int[][] b , int[][] ans) {
        for(int i = 0 ; i<ans.length ; i++){
            for (int j = 0; j < ans[0].length; j++) {
                for(int k =  0 ; k < b.length ;k++){
                    ans[i][j] += a[i][k]*b[k][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        //  int[][] a = new int[2][3];
        // int[][] b = new int[3][1];
        // input(a); input(b);
        int[][] a ={{1,2,1},{2,1,2}}; // 2*3
        int[][] b = {{1,0,1,2}, {2,1,0,0,},{0,3,1,1}}; // 3*3
        if(a[0].length != b.length )
            System.out.println("multiplication not possible");
        else {
            int[][] ans = new int[a.length][b[0].length];
            multiply(a,b,ans);
            print(ans);
        }
    }
}
