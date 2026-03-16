package _02_MultidimensionalArraays;

public class ScoreAfterFlippingMatrix {
    public static void main(String[] args) {
        // leetcode 861
    }
}
/*
class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length , n = grid[0].length ;
        // for first column
        for(int i = 0 ; i<m ; i++){
            if(grid[i][0] == 0){
                for(int j = 0 ; j<n ; j++){
                    if(grid[i][j] ==  1 ) grid[i][j] = 0 ;
                    else grid[i][j] =  1 ;
                }
            }
        }
        // for the remaining columns
        for(int j = 1 ; j<n ; j++ ){
            int count = 0 ;
            for(int i = 0 ; i<m ; i++){
                if(grid[i][j] ==  1) count++;
                else count--;
            }
            if(count<0){
                for(int i = 0 ; i<m ; i++){
                    if(grid[i][j] ==  0 ) grid[i][j] = 1 ;
                    else grid[i][j] = 0 ;
                }
            }
        }
        // now convert to decimal
        int ans = 0 ;
        for(int i = 0 ; i<m ; i++){
            int power = n-1 ;
            for(int j = 0 ; j<n; j++){
                if(grid[i][j] == 1 ) ans += Math.pow(2,power);
                power -= 1;
             }
        }
        return ans ;
    }
}
 */
