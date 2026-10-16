package _29_Backtracking;

import java.util.ArrayList;

public class GfgRatInMaze {
}

class Solution5 {
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length ;

        ArrayList<String> result = new ArrayList<>() ;

        boolean[][] visited = new boolean[n][n];

        backtrack( maze , visited , result , new StringBuilder() , 0 , 0 ) ;

        return result ;
    }
    public void backtrack(int[][] maze , boolean[][] visited ,  ArrayList<String> result
            , StringBuilder sb , int row , int col ){

        int n = maze.length ;
        if( row >= n || col >= n || row < 0 || col < 0  || maze[row][col] == 0 || visited[row][col] == true ) return ;


        if( row ==  n- 1 && col == n - 1){
            result.add(new String(sb.toString()));
            return ;
        }

        visited[row][col] = true ; // mark current one as visited

        // go down
        backtrack(maze , visited , result , sb.append("D") , row + 1 , col ) ;
        sb.deleteCharAt(sb.length() - 1 ) ;

        // go left
        backtrack(maze , visited , result , sb.append("L") , row  , col - 1  ) ;
        sb.deleteCharAt(sb.length() - 1 ) ;

        // go right
        backtrack(maze , visited , result , sb.append("R") , row  , col + 1 ) ;
        sb.deleteCharAt(sb.length() - 1 ) ;

        // go upward
        backtrack(maze , visited , result , sb.append("U") , row - 1 , col ) ;
        sb.deleteCharAt(sb.length() - 1 ) ;

        visited[row][col] = false ; // mark unvisited
    }
}


// case if we use string instead of stringBuilder --- to hme remove nhi krna padege last added char ko
                                    // qunki String ... immutability ..... .........

/*
class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {

        int n = maze.length ;
        ArrayList<String> result = new ArrayList<>() ;
        boolean[][] visited = new boolean[n][n];

        backtrack( maze , visited , result , new String() , 0 , 0 ) ;

        return result ;
    }
    public void backtrack(int[][] maze , boolean[][] visited ,  ArrayList<String> result
                                                        , String path , int row , int col ){

        int n = maze.length ;
        if( row >= n || col >= n || row < 0 || col < 0  || maze[row][col] == 0 || visited[row][col] == true ) return ;


        if( row ==  n- 1 && col == n - 1 ){
            result.add(new String(path));
            return ;
        }

        visited[row][col] = true ; // mark current one as visited

        backtrack(maze , visited , result , path + "D" , row + 1 , col ) ; // go down
        backtrack(maze , visited , result , path + "L", row  , col - 1 ) ; // go left
        backtrack(maze , visited , result , path + "R", row  , col + 1 ) ; // go right
        backtrack(maze , visited , result , path + "U", row - 1 , col ) ; // go upward

        visited[row][col] = false ; // mark unvisited
    }
}
 */