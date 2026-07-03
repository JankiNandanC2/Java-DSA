package _20_HashSetAndHashMap;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode1497 {
    class Solution {
        public boolean canArrange(int[] arr, int k) {

            HashMap<Integer , Integer> map = new HashMap<>();
            int pairCount = 0;

            for(int i = 0 ; i < arr.length ; i++){

                // int remA= arr[i] % k ;
                // if( remA < 0 ) remA += k ; // -ve rem case

                int remA = (( arr[i] % k ) + k ) % k ;

                int pair = (k - remA) % k  ;
                int freq = map.getOrDefault( pair , 0) ;
                if( freq > 0 ){
                    pairCount++ ;
                    if( freq == 1 ) map.remove( pair ) ;
                    else map.put( pair ,  freq-1 );
                }
                else map.put(remA , map.getOrDefault( remA , 0)+1 );
            }

            return (pairCount == arr.length/2 ) ;
        }
    }
}


// brute Force paassed 93/99 cases --> tle
class BrutForceSolution  {
    public boolean canArrange(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr.length ; i++){
            if( set.contains(i)) continue ;

            boolean paired = false ;
            for(int j = 0 ; j < arr.length ; j++){
                if( i == j || set.contains(j) ) continue ;
                if( (arr[i] + arr[j]) % k == 0  ){
                    set.add(i);
                    set.add(j);
                    paired = true ;
                    break ;
                }
            }
            if( ! paired ) return false ;
        }

        return true ;
    }
}