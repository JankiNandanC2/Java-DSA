package _30_Greedy;

import java.util.* ;

public class GfgMaximumCostToCutABoardIntoSquares {
}

class Solution1 {
    public static int minCost(int n, int m, int[] x, int[] y) {
        // code here
        Arrays.sort(y) ;
        Arrays.sort(x) ;

        int i = m-2 , j = n - 2 , totalCost = 0 ;
        int horizontalPiece = 1 , verticalPiece = 1 ; // horizontalPiece and verticalPiece

        while( i >= 0 && j >= 0 ){
            // vertical is greater
            int cost = 0 ;
            if( x[i] >= y[j] ){
                cost = x[i] * verticalPiece ;
                horizontalPiece++ ;
                i-- ;
            }
            else {
                cost = y[j] * horizontalPiece ;
                verticalPiece++ ;
                j-- ;
            }
            totalCost += cost ;
        }

        // if i remains
        while( i >= 0 ){
            totalCost += ( x[i--] * verticalPiece ) ;
        }

        // or if j remians
        while( j >= 0 ){
            totalCost += ( y[j--] * horizontalPiece ) ;
        }

        return totalCost ;
    }
}