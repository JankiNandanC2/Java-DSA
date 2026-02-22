package _08_Recursion;

public class _24_LeetCode38 {
    static void main(String[] args) {

    }
}
/*
class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1" ;
        // string s which t be modified
        String s = countAndSay(n-1);
        String ans = "" ;
        //now compress the string
        int i = 0 , j = 0 ;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++ ;
            else {
                int length = j-i ;
                ans += length ;
                ans += s.charAt(i) ;
                i = j ;
            }
        }
        int length = j-i ;
        ans += length ;
        ans += s.charAt(i) ;
        i = j ;
        return ans ;
    }
}
 */