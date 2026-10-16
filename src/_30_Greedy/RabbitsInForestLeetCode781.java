package _30_Greedy;

import java.util.HashMap;
import java.util.Map;

public class RabbitsInForestLeetCode781 {
}
class Solution100 {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int rabbits : answers) // store the freq
            freq.put((rabbits + 1), freq.getOrDefault((rabbits + 1), 0) + 1);

        int ans = 0 ;
        for(int key : freq.keySet()){

            int value = freq.get(key) ;
            int quotient = value / key ;
            int remainder = value % key ;

            ans += (quotient * key );
            if( remainder > 0 ) ans += key ;
        }

        return ans ;
    }
}