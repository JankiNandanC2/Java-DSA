package _29_Backtracking;

public class Leetcode37SudokuSolver {
}

class Solution6 {
    public void solveSudoku(char[][] board) {
        solve(board) ;
    }
    public boolean solve(char[][] board ){
        int n = board.length ;

        for(int row = 0 ; row < n ; row++){
            for(int col = 0 ; col < n ; col++){
                if( board[row][col] == '.'){
                    for(int k = 1 ; k <= 9 ; k++ ){
                        if( isValid(board , row , col , k )){
                            board[row][col] = (char)  ('0' + k) ;
                            if(solve(board) ) return true ;
                            else board[row][col] = '.' ;
                        }
                    }
                    return false ;
                }
            }
        }

        return true ;
    }

    public boolean isValid(char[][] board , int row , int col , int digit ){
        int n = board.length ;
        boolean[] rowSeen = new boolean[10] ;
        boolean[] colSeen = new boolean[10] ;
        rowSeen[digit] = true ;
        colSeen[digit] = true ;

        for(int j = 0 ; j < n ; j++ ){ // row check
            if( board[row][j] != '.'){
                int indx = board[row][j] - '0' ;
                if( rowSeen[indx] ) return false ;
                rowSeen[indx] = true ;
            }
        }

        for(int i = 0 ; i < n ; i++ ){ // col check
            if( board[i][col] != '.'){
                int indx = board[i][col] - '0' ;
                if( colSeen[indx] ) return false ;
                colSeen[indx] = true ;
            }
        }

        boolean[] matrixSeen = new boolean[10] ;
        matrixSeen[digit] = true ;

        int r = row/3 * 3 ;
        int c = col/3 * 3 ;

        for(int i = 0 ; i < 3 ; i++){ // curr matrix check
            for(int j = 0 ; j < 3 ; j++){
                if( board[r+i][c+j] != '.') {
                    int indx = board[r+i][c+j] - '0' ;
                    if( matrixSeen[indx] ) return false ;
                    matrixSeen[indx] = true ;
                }
            }
        }

        return true ;
    }
}