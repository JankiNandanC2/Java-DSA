package _04_StringBuilder;

public class Leetcode443_compressString {
    static void main() {
        String str = "aabbbbbbbbbbbbbbbcccsddkdfjjjjjsss";
        char[] chars = str.toCharArray();
        int i = 0 , j = 0 ;
        String ans ="";
        while(j<chars.length){
            if(chars[i] == chars[j]) j++;
            else {
                ans =ans + chars[i];
                int length = j-i ;
                if(length > 1) ans+= length ;
                i = j ;
            }
        }
        ans =ans + chars[i];
        int length = j-i ;
        if(length > 1) ans+= length ;
        System.out.println(ans);
//// quiz question
//        String a ="java";
//        a = a.toUpperCase();
//        System.out.println(a);
    }
}
