package _02_MultidimensionalArraays;

public class SetMatrixZero {
    public static void main(String[] args) {
        // leetcode 73
    }
}
/*
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length , m = matrix[0].length ;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        for(int i = 0 ; i< n; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j]==0) {
                    row[i] = true;
                    col[j] = true ;
                }
            }
        }
        for(int i = 0 ; i<n ; i++){
            if(row[i]==true){
                for(int j = 0 ; j< m; j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j = 0 ; j < m ; j++){
            if(col[j]==true){
                for(int i = 0 ; i<n ; i++){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
 */