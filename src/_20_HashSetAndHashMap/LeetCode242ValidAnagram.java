package _20_HashSetAndHashMap;

import  java.util.HashMap ;

public class LeetCode242ValidAnagram {

    // using hashMap
    class Solution {
        public boolean isAnagram(String s, String t) {
            // if size is not equal its invalid
            if(s.length() != t.length()) return false ;

            HashMap<Character,Integer> map = new HashMap<>();
            // iterate through s
            for(int i = 0 ; i<s.length() ; i++){
                char ch1 = s.charAt(i) ;
                char ch2 = t.charAt(i) ;
                map.put( ch1 , map.getOrDefault( ch1 , 0) +1 );
                map.put( ch2 , map.getOrDefault( ch2 , 0) -1 );
                // remove if its freq is 0
                if(map.get(ch1)==0 ) map.remove(ch1) ;
                if(ch1 != ch2 && map.get(ch2)==0 ) map.remove(ch2) ;
            }
            return map.isEmpty();
        }
    }


    // using array as freq
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length() ) return false;
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int x : arr)
            if (x != 0) return false;

        return true;
    }
}