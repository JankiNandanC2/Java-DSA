package _20_HashSetAndHashMap;

import java.util.HashMap;
import java.util.TreeSet;

public class LeetCode2094 {
    // method 2 optimised

    public int[] findEvenNumbers2(int[] digits) {

        // store the freq of every digit in array
        HashMap<Integer,Integer> map =  new HashMap<>() ;
        for(int digit : digits )
            map.put( digit , map.getOrDefault( digit , 0) + 1 ) ;

        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 100 ; i <= 999 ; i += 2) { // traverse all even n0 3 digit wale

            // first find the num
            int num  = i ;
            int a = num % 10 ;
            num /= 10 ;
            int b = num % 10 ;
            num /= 10 ;
            int c = num % 10  ;

            // now check freq of every digit from map and update it ...
            int aFreq = map.getOrDefault( a , 0) ;
            if( aFreq > 0 ) {
                map.put( a , aFreq - 1 ) ; // reduce freq by 1
                int bFreq = map.getOrDefault( b , 0 ) ;
                if( bFreq >0 ) {
                    map.put(b, bFreq - 1); // reduce freq by 1
                    int cFreq = map.getOrDefault( c , 0)  ;
                    if( cFreq > 0 ) set.add( i ) ;
                }
                map.put(b , bFreq) ; // update it to original freq
                map.put(a , aFreq) ; // update it to original freq
            }

        }

        int indx = 0 ;
        int[] ans = new int[set.size()];
        for(int ele : set ) ans[indx++] = ele ;

        return ans ;
    }



    // method 1 BruteForce
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (i == j) continue;
                for (int k = 0; k < digits.length; k++) {
                    if (k == i || k == j) continue;
                    int num = (digits[i] * 100) + (digits[j] * 10) + (digits[k]);
                    if ((num >= 100 && num <= 999) && (num % 2 == 0))
                        set.add(num);
                }
            }
        }

        int indx = 0;
        int[] ans = new int[set.size()];
        for (int ele : set) ans[indx++] = ele;

        return ans;
    }
}
