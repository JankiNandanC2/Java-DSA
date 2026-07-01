package _20_HashSetAndHashMap;

import java.util.HashSet ;

public class Leetcode2744 {
    class Solution {
        public int maximumNumberOfStringPairs(String[] words) {
            HashSet<String> set = new HashSet<>() ;
            int pairs = 0 ;
            for(int i = 0 ; i < words.length ; i++){
                if( set.contains(words[i]) ) pairs++ ;
                else {
                    set.add( words[i] ) ;
                    StringBuilder sb = new StringBuilder(words[i]) ;
                    sb = sb.reverse() ;
                    set.add(sb.toString()) ;
                }
            }
            return pairs ;
        }
    }
}

// brute force aproach ---> O(n^2) time and O(1) space
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int pairs = 0 ;
        for(int i = 0 ; i < words.length ; i++){
            for(int j = i+1 ; j < words.length ; j++){
                if( words[i].charAt(0) == words[j].charAt(1)  && words[i].charAt(1) == words[j].charAt(0) )
                    pairs++ ;
            }
        }
        return pairs ;
    }
}
