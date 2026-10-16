package _30_Greedy;

import java.util.List;

public class GffMinimumProductSubset {
}

class Solution {
    public int minProd(List<Integer> arr) {
        // code here
        int negCount = 0 , posCount = 0 , zeroCount = 0 ;
        int maxNeg = Integer.MIN_VALUE  ;
        int minPos = Integer.MAX_VALUE ;
        int product = 1 ;
        for(int num : arr ){
            if( num == 0 ) {
                zeroCount++ ;
                continue ;
            }
            else if( num > 0 ){
                posCount++ ;
                minPos = Math.min( num , minPos) ;
            }else if ( num < 0 ){
                negCount++ ;
                maxNeg = Math.max( maxNeg , num ) ;
            }
            product = (product * num) ;
        }

        if( negCount % 2 != 0 ) return product ; // odd negCount case
        else if( negCount > 0 ) return (product / maxNeg) ; // even NegCount case
        else if( posCount + zeroCount == arr.size() ) {
            if( zeroCount > 0 ) return 0 ;
            return minPos ;
        }
        return 0 ; // all zero case
    }
}