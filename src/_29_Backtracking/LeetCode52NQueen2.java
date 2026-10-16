package _29_Backtracking;

public class LeetCode52NQueen2 {
}

class Solution4 {
    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        int[] ans = {0};
        queen(board , 0  , ans ) ;
        return ans[0] ;
    }

    public void queen(int[][] board , int r ,int[] ans ) {
        if( r == board.length ){
            ans[0]++ ;
            return ;
        }

        for(int c = 0 ; c < board.length ; c++){
            if( isSafe(board , r , c )){
                board[r][c] = 1 ;
                queen( board , r + 1 , ans ) ;
                board[r][c] = 0 ;
            }
        }
    }
    public boolean isSafe(int[][] board , int r , int c ){
        // validate vertical case
        for(int row = 0 ; row < r ; row++ ){
            if( board[row][c] == 1 )
                return false ;
        }

        int row = r , col = c ;
        while( row >= 0 && col >= 0 ){
            // check left digonal case
            if( board[row--][col--] == 1 )
                return false ;
        }

        row = r ; col = c ;
        while( row >= 0 && col < board.length  ) {
            // check right digonal
            if( board[row--][col++] == 1  )
                return false ;
        }

        return true ;
    }
}