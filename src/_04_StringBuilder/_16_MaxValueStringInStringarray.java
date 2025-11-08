package _04_StringBuilder;

import java.util.Scanner;

public class _16_MaxValueStringInStringarray {
    static void main() {
        /*
        // parseInt can handle upto 10 digit int value only
        String[] str ={"11111553","7983590","798384","89698340","98753359","3454850"};
        int mx =Integer.parseInt(str[0]);
        for(int i = 1 ; i< str.length ;i++){
            int a = Integer.parseInt(str[i]);
            mx=Math.max(mx,a);
        }
        System.out.println(mx);
         */
        String[] str ={"111115253","0038480884","798322590","79998384","89698340","983753359","3454850", "0092"};
        String maxS = str[0];
        for (int i = 1; i < str.length; i++) {
            maxS = max(maxS, str[i]);
        }
        System.out.println(maxS);
    }

//to find the max elements in string array
    public static String max(String a , String b ){
        // created two new strings so that we can store the purified strings without disturbing the original strings
        String s  = purify(a) ;
        String t =  purify(b) ;
        if(s.length() > t.length()) return a ;
        if(s.length() < t.length()) return b ;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a ;
                else return b ;
            }
        }
        if(a.length()>b.length()) return a ;
        else return b ;
    }

// to make a string st start from a non-zero num like for e.g.  00087 ---> 87
    public static String purify(String s){
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) !=  '0' ) return s.substring(i);
        }
        return s ;
    }
}
