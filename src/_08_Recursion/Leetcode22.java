package _08_Recursion;

import java.util.*;
/*
class Solution {
    public void parenthesis(List<String> ans,int open , int close, int n, String s) {
        if (s.length()==2*n) {
            ans.add(s);
            return;
        }
        if (open < n) parenthesis(ans,open+1,close, n, s +'(');
        if (close < open) parenthesis(ans,open, close +1 , n,s +')');
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        parenthesis(ans,0,0, n, "");
        return ans;
    }
}
 */
public class Leetcode22 {
    public static void parenthesis(int open , int close, int n, String s) {
        if (s.length()==2*n) {
            System.out.println(s);
            return;
        }
        if (open < n) parenthesis(open+1,close, n, s +'(');
        if (close < open) parenthesis(open, close +1 , n,s +')');
    }
    static void main(String[] args) {
        /*
        Solution s = new Solution();
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list  = s.generateParenthesis(scan.nextInt());
        System.out.println(list);
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        parenthesis(0,0, n, "");
    }
}
