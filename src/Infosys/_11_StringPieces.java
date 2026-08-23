package Infosys;

import java.util.Scanner;

public class _11_StringPieces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        // find the min freq 
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i< freq.length ; i++){
            if( freq[i] == 0 ) continue;
            ans = Math.min(ans , freq[i]);
        }
        System.out.println(ans);
    }


}