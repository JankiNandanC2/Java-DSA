package _20_HashSetAndHashMap;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int i = 0 , j = 0 , longest = 0 ;
            HashMap<Character, Integer> map = new HashMap<>();

            for( i = 0 ; i < s.length() ; i++){
                char ch = s.charAt(i) ;

                if( map.containsKey(ch) && map.get(ch) >= j ){
                    longest = Math.max( longest , i - j );
                    // update the new indx and store the duplicate indx
                    int duplicateIndx = map.put( ch , i );
                    j = duplicateIndx + 1 ;  // update j value
                }
                else map.put(ch , i);
            }
            longest = Math.max( longest , i -j ) ;

            return longest ;
        }
    }

    class Solution2 {
        public int lengthOfLongestSubstring(String s) {
            int i = 0 , j = 0 , longest = 0 ;
            HashSet<Character> set = new HashSet<>();

            for( i = 0 ; i < s.length() ; i++){
                char ch = s.charAt(i) ;
                if( set.contains(ch)){
                    longest = Math.max( longest , set.size());
                    while( s.charAt(j) != ch ){
                        set.remove(s.charAt(j));
                        j++ ;
                    }
                    set.remove(s.charAt(j++)); //remove the duplicate char
                }
                set.add(ch);
            }

            return Math.max(longest , set.size()) ;
        }
    }
}
