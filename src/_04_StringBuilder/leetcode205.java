package _04_StringBuilder;

public class leetcode205 {
    // isomorphic string
    static void main() {
        char[] ch = new char[26];
        for(char ele :ch){
            System.out.print(ele+" ");
        }
    }
}

// leetcode sol
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] ch = new char[128];  // '\0'
        // checking for s --> t
        for(int i = 0 ; i<s.length() ;i++){
            char c =  s.charAt(i);
            char d = t.charAt(i);
            int n = (int) c;
            if(ch[n] == '\0'){
                ch[n] = d ;
            }
            else {
                if(ch[n] != d)
                    return false ;
            }
        }
        // again set the value to null in char array
        for(int i = 0 ; i < ch.length ; i++){
            ch[i]='\0';
        }
        // for checking  t--> s
        for(int i = 0 ; i< s.length() ;i++){
            char x = s.charAt(i);
            char y = t.charAt(i);
            int n =(int) y ;
            if(ch[n] == '\0'){
                ch[n]= x;
            }
            else {
                if(ch[n] != x ) return false ;
            }
        }
        // return true if all the else lock is not ececuted
        return true ;
    }
}