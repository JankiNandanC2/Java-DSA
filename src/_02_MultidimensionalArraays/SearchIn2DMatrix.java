package _02_MultidimensionalArraays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        // leetcode 240
    }
}
/*
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // optimised
        int i = matrix.length -1 ,  j = 0  ;
        while(i >= 0 && j < matrix[0].length ){
            if(matrix[i][j] == target ) return true ;
            else if ( target < matrix[i][j] ) i-- ;
            else j++;
        }
       return false ;
    }
}
 */