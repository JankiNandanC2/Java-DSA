package _29_Backtracking;

import java.util.*;

public class LeetCode51NQueen {
}
class Solution3 {
    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n] ;
        for(int i = 0 ; i < n ; i++ ){ // initially fill the board with .
            Arrays.fill(board[i] , '.');
        }

        List<List<String>> result = new ArrayList<>();

        queen(result , board , 0 ) ;

        return result ;
    }
    public void queen(List<List<String>> result , char[][] board , int row ){
        int n = board.length ;

        if( row == n ){
            List<String> list = new ArrayList<>();
            for(int i = 0 ; i < n ; i++ ){
                StringBuilder sb = new StringBuilder();
                for(int j = 0 ; j < n ; j++ ){
                    sb.append(board[i][j]);
                }
                list.add(sb.toString());
            }
            result.add(list);
            return ;
        }

        for(int col = 0 ; col < n ; col++ ){
            if( isSafe(board, row , col )){
                board[row][col] = 'Q' ;

                queen( result , board , row + 1) ;

                board[row][col] = '.' ;
            }
        }
    }

    public boolean isSafe(char[][] board , int r , int c ){
        int n = board.length ;

        // vertical check
        for(int i = 0 ; i < n ; i++  ){
            if( i >= r ) break ;
            if( board[i][c] == 'Q') return false ;
        }

        //left diagonal check
        int row = r , col = c ;
        while( row >= 0 && col >= 0 ){
            if(board[row][col] == 'Q') return false ;
            row-- ;
            col-- ;
        }

        //right diagonal check
        row = r ; col = c ;
        while( row >= 0 && col < n ){
            if(board[row][col] == 'Q') return false ;
            row-- ;
            col++ ;
        }

        return true ;
    }
}
