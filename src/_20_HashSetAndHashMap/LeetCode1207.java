package _20_HashSetAndHashMap;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode1207 {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer,Integer> freq = new HashMap<>();
            for(int num : arr) freq.put( num , freq.getOrDefault( num , 0) + 1);

            // now add every freq to set
            HashSet<Integer> set = new HashSet<>();
            for(int val : freq.values()){
                if(set.contains(val)) return false ;
                set.add(val);
            }

            return true ;
        }
    }
}
